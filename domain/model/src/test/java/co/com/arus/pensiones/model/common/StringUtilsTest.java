package co.com.arus.pensiones.model.common;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class StringUtilsTest {

    @Test
    public void testIsEmpty() {
        assertThat(StringUtils.isEmpty((String) null)).isTrue();
        assertThat(StringUtils.isEmpty("")).isTrue();
        assertThat(StringUtils.isEmpty("2112")).isFalse();
        assertThat(StringUtils.isEmpty(" ")).isFalse();
    }

    @Test
    public void testIsEmptyAny() {
        assertThat(StringUtils.isEmpty(null, "Hi")).isTrue();
        assertThat(StringUtils.isEmpty("", "Hi")).isTrue();
        assertThat(StringUtils.isEmpty("2", "Hi")).isFalse();
        assertThat(StringUtils.isEmpty("2", "  ")).isFalse();
    }
    @Test
    public void testHasWhiteSpace() {
        String str = "teXTo con ESPACIOS_en blanco";
        Assert.assertTrue(StringUtils.isHasWhiteSpace(str));
    }
    @Test
    public void testHasNoWhiteSpace() {
        String str = "TExtoSinespacios_en!blanco";
        Assert.assertFalse(StringUtils.isHasWhiteSpace(str));
    }
    @Test
    public void testHasNoWhiteSpaceBecauseEmpty() {
        String str = "";
        Assert.assertFalse(StringUtils.isHasWhiteSpace(str));
    }
}