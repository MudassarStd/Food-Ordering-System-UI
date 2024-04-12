import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.task.drink
import com.example.task.food

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        // Return the Fragment for the corresponding position
        return when (position) {
            0 -> food()
            1 -> drink()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

    override fun getCount(): Int {
        // Return the number of tabs
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        // Set tab titles
        return when (position) {
            0 -> "Tab 1"
            1 -> "Tab 2"
            else -> null
        }
    }
}
