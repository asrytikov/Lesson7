package p1;

public class Main {

    public static void main(String[] args) {
        /*Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();*/

        Button tvButton = new Button(new EventHandler() {

            private boolean on = false;
            @Override
            public void execute() {
                if (on){
                    System.out.println("TV is unactive");
                    on = false;
                }else{
                    System.out.println("TV is active!");
                    on = true;
                }
            }
        });

        Button printBtn = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Print!!!");
            }
        });

        tvButton.click();
        printBtn.click();
        tvButton.click();
    }

}

class ButtonClickHandler implements EventHandler{

    @Override
    public void execute() {
        System.out.println("Button");
    }
}

interface EventHandler{
    void execute();
}

class Button{

    EventHandler handler;

    public Button(EventHandler action){
        this.handler = action;
    }
    public void click(){
        handler.execute();
    }
}
