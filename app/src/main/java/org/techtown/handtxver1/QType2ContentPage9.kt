package org.techtown.handtxver1

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import org.techtown.handtxver1.databinding.FragmentQType2ContentPage9Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [QType2ContentPage9.newInstance] factory method to
 * create an instance of this fragment.
 */
class QType2ContentPage9 : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentQType2ContentPage9Binding

    private val viewModel: ViewModelForQType2 by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_q_type2_content_page9,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // onViewCreated 메서드를 재정의 하되, onRadioButtonClicked 가 실행되도록 재정의
        // onRadioButtonClicked 는 반드시 view 를 파라미터로 가져야 함. 왜냐하면 radioButton 클릭시 실행되는 매서드라
        // 해당 버튼이 파라미터로 와야함. 따라서 뒤에 구현할 때, 반드시 파라미터를 View 인스턴스로 작성
        binding.button1.setOnClickListener { onRadioButtonClicked(it) }
        binding.button2.setOnClickListener { onRadioButtonClicked(it) }
        binding.button3.setOnClickListener { onRadioButtonClicked(it) }
        binding.button4.setOnClickListener { onRadioButtonClicked(it) }
        binding.button5.setOnClickListener { onRadioButtonClicked(it) }
    }

    private fun onRadioButtonClicked(view: View) {
        // onRadioButtonClicked 메서드를 직접 구현해주는 코드를 작성.
        // 각 radioButton 에 대하여 클릭된 버튼의 글씨 색만을 하얀색, 나머지는 검은색으로 지정.
        // 이후 ViewModel 에 체크상태 전달을 위한 장소이기도 함.
        if (view is RadioButton) {
            val checked = view.isChecked
            when (view.id) {
                R.id.button1 -> {
                    if (checked) {
                        view.setTextColor(Color.parseColor("#FFFFFF"))
                        binding.button2.setTextColor(Color.parseColor("#000000"))
                        binding.button3.setTextColor(Color.parseColor("#000000"))
                        binding.button4.setTextColor(Color.parseColor("#000000"))
                        binding.button5.setTextColor(Color.parseColor("#000000"))
                        viewModel.updateResponse(9,1)
                    }
                }

                R.id.button2 -> {
                    if (checked) {
                        view.setTextColor(Color.parseColor("#FFFFFF"))
                        binding.button1.setTextColor(Color.parseColor("#000000"))
                        binding.button3.setTextColor(Color.parseColor("#000000"))
                        binding.button4.setTextColor(Color.parseColor("#000000"))
                        binding.button5.setTextColor(Color.parseColor("#000000"))
                        viewModel.updateResponse(9,2)
                    }
                }

                R.id.button3 -> {
                    if (checked) {
                        view.setTextColor(Color.parseColor("#FFFFFF"))
                        binding.button1.setTextColor(Color.parseColor("#000000"))
                        binding.button2.setTextColor(Color.parseColor("#000000"))
                        binding.button4.setTextColor(Color.parseColor("#000000"))
                        binding.button5.setTextColor(Color.parseColor("#000000"))
                        viewModel.updateResponse(9,3)
                    }
                }

                R.id.button4 -> {
                    if (checked) {
                        view.setTextColor(Color.parseColor("#FFFFFF"))
                        binding.button1.setTextColor(Color.parseColor("#000000"))
                        binding.button2.setTextColor(Color.parseColor("#000000"))
                        binding.button3.setTextColor(Color.parseColor("#000000"))
                        binding.button5.setTextColor(Color.parseColor("#000000"))
                        viewModel.updateResponse(9,4)
                    }
                }

                R.id.button5 -> {
                    if (checked) {
                        view.setTextColor(Color.parseColor("#FFFFFF"))
                        binding.button1.setTextColor(Color.parseColor("#000000"))
                        binding.button2.setTextColor(Color.parseColor("#000000"))
                        binding.button3.setTextColor(Color.parseColor("#000000"))
                        binding.button4.setTextColor(Color.parseColor("#000000"))
                        viewModel.updateResponse(9,5)
                    }
                }

            }
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment QType2ContentPage9.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            QType2ContentPage9().apply {
                arguments = Bundle().apply {

                }
            }
    }
}