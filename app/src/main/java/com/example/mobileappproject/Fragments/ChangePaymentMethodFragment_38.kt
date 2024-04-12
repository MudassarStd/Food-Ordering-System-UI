import android.content.Context
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.PopupWindow
import android.widget.RadioButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileappproject.Adapters.RVPaymentMethodsAdapter
import com.example.mobileappproject.Fragments.BtmSheetPaymentMethodFragment
import com.example.mobileappproject.Fragments.Payment2Fragment_34
import com.example.mobileappproject.R
import com.example.mobileappproject.Utils.MoveFragments
import com.example.mobileappproject.databinding.FragmentPayment234Binding

class ChangePaymentMethodFragment_38 : Fragment() {

    private val paymentMethods = listOf("Dana", "LinkAja", "Ovo")
    private val logos = listOf(R.drawable.dana_logo, R.drawable.linkaja_logo, R.drawable.ovo_logof)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_change_payment_method_38, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//            BtmSheetPaymentMethodFragment().dismiss()

        // anchor view
        val eWalletMenu = view.findViewById<LinearLayout>(R.id.llPaymentMethods)
        val btnConfirmPayment = view.findViewById<Button>(R.id.btnConfirmPayment)
        val rvPaymentMethods = view.findViewById<RecyclerView>(R.id.rvPaymentMethods)

        rvPaymentMethods.adapter = RVPaymentMethodsAdapter(paymentMethods, logos)
        rvPaymentMethods.layoutManager = LinearLayoutManager(requireContext())

        eWalletMenu.setOnClickListener {
            if (rvPaymentMethods.visibility == View.GONE)
            {
             rvPaymentMethods.visibility = View.VISIBLE
            }
            else
            {
                rvPaymentMethods.visibility = View.GONE
            }
        }




        // moving to main payment page after confirmation
        btnConfirmPayment.setOnClickListener {

             MoveFragments.replaceFragmentOnPaymentHostActivity(requireActivity().supportFragmentManager, Payment2Fragment_34())

            }
        }


    }



