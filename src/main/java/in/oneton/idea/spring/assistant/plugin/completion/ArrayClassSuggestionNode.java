package in.oneton.idea.spring.assistant.plugin.completion;

import com.intellij.psi.PsiClass;
import in.oneton.idea.spring.assistant.plugin.model.ClassSuggestionNode;
import in.oneton.idea.spring.assistant.plugin.model.SuggestionNodeType;

import static in.oneton.idea.spring.assistant.plugin.model.SuggestionNodeType.ARRAY;

public class ArrayClassSuggestionNode extends ClassSuggestionNode {

  public ArrayClassSuggestionNode(PsiClass target) {
    super(target);
  }

  @Override
  public SuggestionNodeType getType() {
    return ARRAY;
  }
}
