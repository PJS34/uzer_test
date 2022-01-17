import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uzer_test.R

class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView
    val imageView: ImageView

    init {
        textView = view.findViewById(R.id.baseTextView)
        imageView = view.findViewById(R.id.baseImageView)
    }
}
class GlobalViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var recyclerView: RecyclerView? = null

    init {
        recyclerView = view.findViewById(R.id.globalRecyclerViewItem)
    }
}

fun createBaseDataset(): List<Pair<String,String>> {
    val data: ArrayList<Pair<String,String>> = ArrayList()


    data.add(Pair("titre image","https://images.unsplash.com/photo-1503023345310-bd7c1de61c7d?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MXx8aHVtYW58ZW58MHx8MHw%3D&ixlib=rb-1.2.1&w=1000&q=80"))
    data.add(Pair("titre image","https://images.unsplash.com/photo-1541963463532-d68292c34b19?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8M3x8fGVufDB8fHw%3D&w=1000&q=80"))
    data.add(Pair("titre image","https://images.unsplash.com/photo-1503023345310-bd7c1de61c7d?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MXx8aHVtYW58ZW58MHx8MHw%3D&ixlib=rb-1.2.1&w=1000&q=80"))
    data.add(Pair("titre image","https://images.unsplash.com/photo-1541963463532-d68292c34b19?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8M3x8fGVufDB8fHw%3D&w=1000&q=80"))
    data.add(Pair("titre image","https://images.unsplash.com/photo-1503023345310-bd7c1de61c7d?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MXx8aHVtYW58ZW58MHx8MHw%3D&ixlib=rb-1.2.1&w=1000&q=80"))
    return data
}