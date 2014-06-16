package list.builder;

public class ListStringBuilder extends AbstractListStringBuilder {

	private StringBuilder builder;
	public ListStringBuilder() {
		builder = new StringBuilder();
	}

	@Override
	public ListStringBuilder append(String str) {
		builder.append("- " + str + "\n");
		return this;
	}

	@Override
	public String toString() {
		return this.builder.toString();
	}
}
