package controller;



public class HandlerMapping {
	
	private static HandlerMapping handler = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return handler;
	}
	
	public Controller createController(String command) {
		Controller controller = null;
		
		if(command.equals("AllItem.do")) {
			controller = new GetAllItem();
		} else if(command.equals("itemView.do")) {
			controller = new ItemViewController();
		}
		
		return controller;
	}
	
}


