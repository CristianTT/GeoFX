
package dad.javafx.geofx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Language {

	private StringProperty code = new SimpleStringProperty();
	private StringProperty name = new SimpleStringProperty();
	private StringProperty _native = new SimpleStringProperty();

	public Language() {
	}

	public Language(String code, String name, String _native) {
		super();
		this.code.set(code);
		this.name.set(name);
		this._native.set(_native);
	}

	public final StringProperty codeProperty() {
		return this.code;
	}
	

	public final String getCode() {
		return this.codeProperty().get();
	}
	

	public final void setCode(final String code) {
		this.codeProperty().set(code);
	}
	

	public final StringProperty nameProperty() {
		return this.name;
	}
	

	public final String getName() {
		return this.nameProperty().get();
	}
	

	public final void setName(final String name) {
		this.nameProperty().set(name);
	}
	

	public final StringProperty nativeProperty() {
		return this._native;
	}
	

	public final String getNative() {
		return this.nativeProperty().get();
	}
	

	public final void setNative(final String _native) {
		this.nativeProperty().set(_native);
	}
	

}