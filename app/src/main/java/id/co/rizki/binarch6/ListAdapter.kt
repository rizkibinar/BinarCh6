package id.co.rizki.binarch6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.co.rizki.binarch6.databinding.ItemStoreBinding
import id.co.rizki.binarch6.model.StoreItem


/**
 * Created by Rizky Putra on 22/06/22.
 */

//step 3 implement recyclerview, bikin adapter
class ListAdapter(private val listStoreItem: ArrayList<StoreItem>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(private val storeBinding: ItemStoreBinding) : RecyclerView.ViewHolder(storeBinding.root) {
        fun bind(storeItem: StoreItem) {

            //step 4 implement recyclerview, bind data ke view
            storeBinding.tvTitle.text = storeItem.name
            storeBinding.tvDev.text = storeItem.developer
            storeBinding.tvCategory.text = storeItem.category
            storeBinding.tvRating.text = storeItem.rating

            Glide.with(itemView.context).load(storeItem.imageUrl).into(storeBinding.ivLogo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemStoreBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item : StoreItem = listStoreItem[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return listStoreItem.size
    }
}