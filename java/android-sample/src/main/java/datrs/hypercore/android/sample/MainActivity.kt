package datrs.hypercore.android.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import datrs.hypercore.Hypercore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = Hypercore.HypercoreFFI.INSTANCE.banana().toString()
    }

}
