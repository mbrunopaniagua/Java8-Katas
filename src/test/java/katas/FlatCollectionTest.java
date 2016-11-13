package katas;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FlatCollectionTest {
//    Flatten multidimensional collection
        @Test
        public void transformShouldFlattenCollection() {
            List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
            List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
            assertThat(FlatCollection.transform(collection), is(expected));
        }
}
