package co.com.arus.pensiones.model.common.ex;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

public class BusinessExceptionTest {

    @Test
    public void testException() {
        final BusinessException ex = BusinessException.Type.INVALID_TODO_INITIAL_DATA.build();
        assertThat(ex).hasMessage("Invalid TODO initial data");
        assertThat(ex.getCode()).isEqualTo("INVALID_TODO_INITIAL_DATA");
    }

    @Test
    public void testExceptionDefer() {
        final Supplier<Throwable> defer = BusinessException.Type.INVALID_TODO_INITIAL_DATA.defer();
        assertThat(defer.get()).hasMessage("Invalid TODO initial data");
        assertThat(((BusinessException)defer.get()).getCode()).isEqualTo("INVALID_TODO_INITIAL_DATA");
    }
}