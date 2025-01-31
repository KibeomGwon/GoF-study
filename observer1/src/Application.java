public class Application {
    public static void main(String[] args) {
        Button button = new Button();

        // observer 설정
        button.setOnClickListener(new Button.OnClickListener() {
            // target의 상태가 변하였다고 받으면 실행
            @Override
            public void onClick(Button button) {
                System.out.println(button + " is Clicked");
            }
        });

        button.onClick();
    }
}

class ButtonClick implements Button.OnClickListener {
    @Override
    public void onClick(Button button) {
        System.out.println(button + " is Clicked");
    }
}
