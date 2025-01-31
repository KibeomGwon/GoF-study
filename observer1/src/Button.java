// Target
public class Button {

    private OnClickListener onClickListener;

    public void onClick() {
        // 로직 실행
        // 이벤트 처리
        if (onClickListener != null) {
            // 상태가 변화 됐다고 observer에 알림
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
