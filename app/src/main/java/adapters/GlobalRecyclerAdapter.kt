package adapters

import GlobalViewHolder
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uzer_test.R
import createBaseDataset

class GlobalRecyclerAdapter(val context : Context) : RecyclerView.Adapter<GlobalViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GlobalViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.global_recycler_view_item, parent, false)
        return GlobalViewHolder(view)
    }

    override fun onBindViewHolder(holder: GlobalViewHolder, position: Int) {
        val adapter = BaseRecyclerAdapter(createBaseDataset())
        holder.recyclerView?.adapter = adapter
        holder.recyclerView?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

    override fun getItemCount(): Int {
        return 2
    }
}