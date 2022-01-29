import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationcolorstatelist.R
import kotlinx.android.synthetic.main.activity_main.*
//import android.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            // if button is already in selected state and now it is pressed
            // again,then it will reach in not selected state and vice versa
            button.isSelected != button.isSelected
        }

        buttonSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            // if the switch is checked,then enable the button,else not
            button.isEnabled = isChecked
        }
    }
}
