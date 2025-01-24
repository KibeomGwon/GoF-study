public class Button {

    private OnClickListener onClickListener;

    public void onClick() {
        // 이벤트 처리
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    // 내부에서 Observer 정의
    public interface OnClickListener {
        void onClick(Button button);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
