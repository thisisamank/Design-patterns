package ChainOfResponsibility;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {

        Director director=new Director();
        VP vp=new VP();
        CEO ceo=new CEO();


        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request=new Request(RequestType.PURCHASE,3870);
        director.handleRequest(request);

        Request request1=new Request(RequestType.CONFERENCE,7483);
        director.handleRequest(request1);



    }

}
