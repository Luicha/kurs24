package papas.milanesa.kurs24


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import papas.milanesa.kurs24.databinding.FragmentHorariosBinding


class Horarios : Fragment() {

    private lateinit var binding: FragmentHorariosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = parentFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHorariosBinding.inflate(inflater, container, false)
        val view = binding.root
        //val primeroFragment = Primero()
        //replaceFragment(primeroFragment)

        binding.navHorario.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.primero -> replaceFragment(Primero())
                R.id.segundo -> replaceFragment(Segundo())
                R.id.tercero -> replaceFragment(Tercero())
                R.id.cuarto -> replaceFragment(Cuarto())
                R.id.quinto -> replaceFragment(Quinto())

                else -> {

                }

            }

            true
        }


        return view
    }

}