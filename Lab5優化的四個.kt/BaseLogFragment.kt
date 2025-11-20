abstract class BaseLogFragment(
    private val layoutId: Int,
    private val tagName: String
) : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(tagName, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(tagName, "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(tagName, "onCreateView")
        return inflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(tagName, "onViewCreated")
    }

    override fun onStart() { super.onStart(); Log.e(tagName, "onStart") }
    override fun onResume() { super.onResume(); Log.e(tagName, "onResume") }
    override fun onPause() { super.onPause(); Log.e(tagName, "onPause") }
    override fun onStop() { super.onStop(); Log.e(tagName, "onStop") }
    override fun onDestroyView() { super.onDestroyView(); Log.e(tagName, "onDestroyView") }
    override fun onDestroy() { super.onDestroy(); Log.e(tagName, "onDestroy") }
    override fun onDetach() { super.onDetach(); Log.e(tagName, "onDetach") }
}
