package papas.milanesa.kurs24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import papas.milanesa.kurs24.databinding.FragmentPrimeroBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Quinto.newInstance] factory method to
 * create an instance of this fragment.
 */
class Quinto : Fragment() {
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

        // Load or update your list data based on your requirements
        // For example, you can call a function to fetch data from a repository or use a ViewModel
        // For now, let's assume you have a function named fetchData() to fetch the list data
        fetchDataForCategory(5)

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
