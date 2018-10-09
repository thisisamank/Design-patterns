package ChainOfResponsibility;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {

        if (request.getType()==RequestType.PURCHASE){

            if (request.getAmount()<=10000){
                System.out.println("VP can handle it!!!");

            }
            else {
                successor.handleRequest(request);
            }

        }
    }
}
