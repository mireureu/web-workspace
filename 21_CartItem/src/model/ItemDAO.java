package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.ldap.Control;

import config.ServerInfo;

public class ItemDAO implements ItemDAOTemplate{
	
	private static ItemDAO dao = new ItemDAO();
	private ItemDAO() {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		return conn;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}

	@Override
	public void closeALl(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps, conn);
	}

	@Override
	public ArrayList<Item> getAllItem() throws SQLException {
		Connection conn = getConnection();
		
		String query = "SELECT * FROM ITEM";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		ArrayList<Item> list = new ArrayList<>();
		while(rs.next()) {
			Item vo = new Item();
			vo.setItemId(rs.getInt("ITEM_ID"));
			vo.setItemName(rs.getString("ITEM_NAME"));
			vo.setPrice(rs.getInt("price"));
			vo.setPictureUrl(rs.getString("PICTURE_URL"));
			vo.setDescription(rs.getString("DESCRIPTION"));
			vo.setCount(rs.getInt("COUNT"));
			list.add(vo);
		}
		return list;
	}

	@Override
	public Item getItem(int itemId) throws SQLException {
		Connection conn = getConnection();
		
		String query = "SELECT * FROM ITEM WHERE item_id=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, itemId);
		
		ResultSet rs = ps.executeQuery();
		Item item = null;
		if(rs.next()) {
			item = new Item();
			item.setItemId(rs.getInt("ITEM_ID"));
			item.setItemName(rs.getString("ITEM_NAME"));
			item.setPrice(rs.getInt("price"));
			item.setPictureUrl(rs.getString("PICTURE_URL"));
			item.setDescription(rs.getString("DESCRIPTION"));
			item.setCount(rs.getInt("COUNT"));

			System.out.println(item);
		}
		closeALl(rs, ps, conn);
		return item;
	}

	@Override
	public boolean updateRecordCount(int itemId) throws SQLException {
		Connection conn = getConnection();
		
		String query = "UPDATE item SET count=count+1 WHERE item_id=?";
		
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, itemId);
		
		int row = ps.executeUpdate();
		
		boolean result = false;
		if(row > 0) result = true;
		
		closeAll(ps, conn);
		
		return result;
	}

	public static void main(String[] args) {
		ItemDAO dao = new ItemDAO();
		
		try {
			System.out.println(dao.getAllItem());
		} catch (SQLException e) {
			System.out.println("실패~");
		}
	}
	public static ItemDAO getInstance() {
		
		return dao;
	}

}
