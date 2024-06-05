import junit.framework.TestCase
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class MainKtTest : TestCase() {

    @Test
    fun testSadArrayToHappy1() {
        val sadArray = intArrayOf(22, 22, 8, 1, 2, 18, 9, 30, 12, 2, 25)
        val happyArray = intArrayOf(22, 22, 8, 1, 2, 2, 25)
        assertArrayEquals(happyArray, sadArrayToHappy(sadArray).toIntArray())
    }

    @Test
    fun testSadArrayToHappy2() {
        val sadArray = intArrayOf(3, 24, 17, 29, 8, 15, 10, 13, 11, 26, 4)
        val happyArray = intArrayOf(3, 8, 15, 10, 13, 11, 4)
        assertArrayEquals(happyArray, sadArrayToHappy(sadArray).toIntArray())
    }

    @Test
    fun testSadArrayToHappy3() {
        val sadArray = intArrayOf(20, 16, 19, 1, 16, 3, 1, 14, 9, 14, 19)
        val happyArray = intArrayOf(20, 16, 1, 1, 9, 14, 19)
        assertArrayEquals(happyArray, sadArrayToHappy(sadArray).toIntArray())
    }

    @Test
    fun testSadArrayToHappy4() {
        val sadArray = intArrayOf(56, 32, 5, 31, 43, 55, 11, 87, 43, 62)
        val happyArray = intArrayOf(56, 32, 5, 11, 43, 62)
        assertArrayEquals(happyArray, sadArrayToHappy(sadArray).toIntArray())
    }

    @Test
    fun testSadArrayToHappy5() {
        val sadArray = intArrayOf(1, 5, 2, 7, 93, 8, 9, 3, 42, 24, 15, 67, 89)
        val happyArray = intArrayOf(1,2,7,8,9,3,15,67,89)
        assertArrayEquals(happyArray, sadArrayToHappy(sadArray).toIntArray())
    }
}