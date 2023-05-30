package suite;

import categorii.Categorie1;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.AplicaDiscountTest;
import test.PoateRezervaTest;


@Suite.SuiteClasses({AplicaDiscountTest.class, PoateRezervaTest.class})
@IncludeTags({"tag1", "tag2"})
public class SuitaCustom {

}
