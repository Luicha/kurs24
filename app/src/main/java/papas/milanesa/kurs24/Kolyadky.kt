package papas.milanesa.kurs24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import papas.milanesa.kurs24.databinding.ActivityMainBinding


class Kolyadky : Fragment() {
    private lateinit var binding : ActivityMainBinding

    val songList = listOf(
        Song("Song 1", "Lyrics for song 1..."),
        Song("Song 2", "Lyrics for song 2..."),
        // Add more songs as needed
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //arguments?.let {   }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_kolyadky, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerViewKoly)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = KolyAdapter(songList)
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Kolyadky().apply {
                arguments = Bundle().apply {

                }
            }
    }
}