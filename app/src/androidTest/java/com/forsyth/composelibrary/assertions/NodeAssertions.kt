import androidx.compose.ui.test.*
import com.forsyth.composelibrary.feature.Asserter

typealias haveStateThat = AssertThatNode
class AssertThatNode(private val matcher: SemanticsMatcher): Asserter<SemanticsNodeInteraction> {
    override fun assertValue(t: SemanticsNodeInteraction) {
        t.assert(matcher)
    }
}

typealias haveChildWithStateThat = AssertThatNodeHasChildWithState
class AssertThatNodeHasChildWithState(private val matcher: SemanticsMatcher): Asserter<SemanticsNodeInteraction> {
    override fun assertValue(t: SemanticsNodeInteraction) {
        t.onChildren().assertAny(matcher)
    }
}
