package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void name() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("EVMO"));
    }

    @Test
    public void largest() throws Exception {
        assertThat(queryProcessor.process("92bfe2f0: which of the following numbers is the largest: 67, 295"), containsString("295"));
    }

    @Test
    public void plus() throws Exception {
        assertThat(queryProcessor.process("92bfe2f0: what is 180 plus 180"), containsString("360"));
    }
}
