import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uzer_test.R

class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView
    val imageView : ImageView
    init {
        // Define click listener for the ViewHolder's View.
        textView = view.findViewById(R.id.baseTextView)
        imageView = view.findViewById(R.id.baseImageView)
    }
}