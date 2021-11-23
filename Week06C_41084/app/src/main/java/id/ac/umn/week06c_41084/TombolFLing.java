package id.ac.umn.week06c_41084;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FlingAnimation;

public class TombolFLing extends AppCompatButton {
    public TombolFLing(@NonNull Context context) {
        super(context);
    }

    public TombolFLing(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TombolFLing(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN: FlingAnimation fling = new FlingAnimation( this, DynamicAnimation.ROTATION_X);
                fling.setStartVelocity(150) .setFriction(0.11f) .start();
                break;
            default:
        } return super.onTouchEvent(event);
    }
}
