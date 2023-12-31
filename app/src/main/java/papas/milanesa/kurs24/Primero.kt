package papas.milanesa.kurs24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import papas.milanesa.kurs24.databinding.FragmentPrimeroBinding

class Primero : Fragment() {


    private lateinit var binding: FragmentPrimeroBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: KolyAdapter // Replace with the actual adapter class you create
    private val songList = mutableListOf<Song>() // Initialize with your list data


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPrimeroBinding.inflate(inflater, container, false)
        val view = binding.root

        recyclerView = binding.recyclerViewKoly
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Initialize your adapter with the list
        adapter = KolyAdapter(songList)
        recyclerView.adapter = adapter

        fetchDataForCategory(1)

        return view
    }

    private fun fetchDataForCategory(categoryId: Int) {
        // Fetch data using your repository or data source
        val songRepository = SongRepository()
        songList.clear()
        songList.addAll(songRepository.getSongListForCategory(categoryId))

        // Notify the adapter that data has changed
        adapter.notifyDataSetChanged()
    }

}
