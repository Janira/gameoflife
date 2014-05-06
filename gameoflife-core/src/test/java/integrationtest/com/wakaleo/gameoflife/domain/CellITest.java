package integrationtest.com.wakaleo.gameoflife.domain;

import static com.wakaleo.gameoflife.domain.Cell.LIVE_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import com.wakaleo.gameoflife.domain.Cell;

public class CellITest {

	@Test
    public void aLiveCellShouldBeRepresentedByAnAsterisk() {
        Cell cell = Cell.valueOf("LIVE_CELL");
        assertThat(cell, is(LIVE_CELL));
    }
}
