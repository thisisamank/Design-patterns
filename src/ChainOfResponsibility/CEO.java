package ChainOfResponsibility;

public class CEO extends Handler{

    @Override
    public void handleRequest(Request request) {

        if (request.getType()==RequestType.PURCHASE){
            System.out.println("CEO can handle it");
        }

    }
}
