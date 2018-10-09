package ChainOfResponsibility;

public class Director extends Handler{


    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.CONFERENCE){
            System.out.println("Yes! we can have a conference");
        }

        else {
            successor.handleRequest(request);
        }
    }
}
