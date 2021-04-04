package com.example.messenger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_messenger.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MessengerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MessengerFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_messenger, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var messagesList = mutableListOf(
            MessageModel(
                "Shane Martinez",
                "On my way home but I needed to stop by the book store to abc axy",
                5,
                20
            ),
            MessageModel(
                "Shane Martinez2",
                "On my way home but I needed to stop by the book store to abc axy2",
                6,
                12
            ),
            MessageModel(
                "Shane Martinez3",
                "On my way home but I needed to stop by the book store to abc axy3",
                7,
                2
            ),
            MessageModel(
                "Shane Martinez4",
                "On my way home but I needed to stop by the book store to abc axy4",
                8,
                3
            ),
            MessageModel(
                "Shane Martinez5",
                "On my way home but I needed to stop by the book store to abc axy5",
                9,
                5
            ),
            MessageModel(
                "Shane Martinez5",
                "On my way home but I needed to stop by the book store to abc axy5",
                9,
                5
            ),
            MessageModel(
                "Shane Martinez5",
                "On my way home but I needed to stop by the book store to abc axy5",
                9,
                5
            ),
            MessageModel(
                "Shane Martinez5",
                "On my way home but I needed to stop by the book store to abc axy5",
                9,
                5
            )
        )

        val adapter = MessageAdapter(messagesList)
        rvMessages.adapter = adapter
        rvMessages.layoutManager = LinearLayoutManager(activity)


        buttonNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.miMessage -> Toast.makeText(activity, "Clicked Message", Toast.LENGTH_SHORT)
                    .show()
                R.id.miPerson -> Toast.makeText(activity, "Clicked Person", Toast.LENGTH_SHORT)
                    .show()
                R.id.miSetting -> Toast.makeText(activity, "Clicked Setting", Toast.LENGTH_SHORT)
                    .show()
            }
            true
        }

        buttonNavigationView.getOrCreateBadge(R.id.miMessage).apply {
            number = 10
            isVisible = true
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MessengerFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MessengerFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}