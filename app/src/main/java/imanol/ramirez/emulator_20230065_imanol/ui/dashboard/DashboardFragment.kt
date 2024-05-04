package imanol.ramirez.emulator_20230065_imanol.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import imanol.ramirez.emulator_20230065_imanol.R
import imanol.ramirez.emulator_20230065_imanol.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val btnPrintName = root.findViewById<Button>(R.id.btnPrintName)
        val txtName = root.findViewById<TextView>(R.id.txtName)

        //Imprimir el nombre del estudiante (20%)
        btnPrintName.setOnClickListener{
            txtName.setText("Alessandro Imanol Ramírez Morán")
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}