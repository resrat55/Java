public class BrowserHistory {
    public int count=0;
    private String[] web;



    public BrowserHistory(int a){
        web=new String[a];

    }
    public void showHistory(){
        if(count==0){
            System.out.println("No web pages visited yet.");
        }else {
            System.out.println("Browser History:");
            for(int i=0;i<count;i++){
                System.out.println(web[i]);
            }
        }
    }
    public void currentWeb(){
        if(count==0){
            System.out.println("You have not visited any website yet!");
        }else System.out.println("Current web page: "+web[count-1]);

    }
    public void visitWeb(String a){
        if(count< web.length){
            web[count++]=a;
        }else System.out.println("History is full. Cannot visit\n" +a+ "web page.");
    }
    public void back(){
        if (count>0){
            web[--count]=null;

        }else System.out.println("History is empty.");
    }
}
