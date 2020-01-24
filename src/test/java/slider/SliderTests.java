package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class SliderTests extends BaseTests {
    @Test
    public void testSlider(){
        String value = "3";
        var sliderPage = homePage.clickSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect!!");

    }
}
