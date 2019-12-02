package dad.javafx.geofx;

import java.util.List;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

public class Location {

	private IntegerProperty geoname_id = new SimpleIntegerProperty();
	private StringProperty capital = new SimpleStringProperty();
	private ListProperty<Language> languages = new SimpleListProperty<Language>(FXCollections.observableArrayList());
	private StringProperty country_flag = new SimpleStringProperty();
	private StringProperty country_flag_emoji = new SimpleStringProperty();
	private StringProperty countryflag_emoji_unicode = new SimpleStringProperty();
	private StringProperty calling_code = new SimpleStringProperty();
	private BooleanProperty is_eu = new SimpleBooleanProperty();

	public Location() {
	}

	public Location(Integer geonameId, String capital, List<Language> languages, String countryFlag,
			String countryFlagEmoji, String countryFlagEmojiUnicode, String callingCode, Boolean isEu) {
		super();
		this.geoname_id.set(geonameId);
		this.capital.set(capital);
		this.languages.setAll(languages);
		this.country_flag.set(countryFlag);
		this.country_flag_emoji.set(countryFlagEmoji);
		this.countryflag_emoji_unicode.set(countryFlagEmojiUnicode);
		this.calling_code.set(callingCode);
		this.is_eu.set(isEu);
	}

	public final IntegerProperty geoname_idProperty() {
		return this.geoname_id;
	}

	public final int getGeoname_id() {
		return this.geoname_idProperty().get();
	}

	public final void setGeoname_id(final int geonameId) {
		this.geoname_idProperty().set(geonameId);
	}

	public final StringProperty capitalProperty() {
		return this.capital;
	}

	public final String getCapital() {
		return this.capitalProperty().get();
	}

	public final void setCapital(final String capital) {
		this.capitalProperty().set(capital);
	}

	public final ListProperty<Language> languagesProperty() {
		return this.languages;
	}

	public final List<Language> getLanguages() {
		return this.languagesProperty().get();
	}

	public final void setLanguages(final List<Language> languages) {
		this.languagesProperty().setAll(languages);
	}

	public final StringProperty country_flagProperty() {
		return this.country_flag;
	}

	public final String getCountry_flag() {
		return this.country_flagProperty().get();
	}

	public final void setCountry_flag(final String countryFlag) {
		this.country_flagProperty().set(countryFlag);
	}

	public final StringProperty country_flag_emojiProperty() {
		return this.country_flag_emoji;
	}

	public final String getCountry_flag_emoji() {
		return this.country_flag_emojiProperty().get();
	}

	public final void setCountry_flag_emoji(final String countryFlagEmoji) {
		this.country_flag_emojiProperty().set(countryFlagEmoji);
	}

	public final StringProperty country_flag_emoji_unicodeProperty() {
		return this.countryflag_emoji_unicode;
	}

	public final String getCountry_flag_emoji_unicode() {
		return this.country_flag_emoji_unicodeProperty().get();
	}

	public final void setCountry_flag_emoji_unicode(final String countryFlagEmojiUnicode) {
		this.country_flag_emoji_unicodeProperty().set(countryFlagEmojiUnicode);
	}

	public final StringProperty calling_codeProperty() {
		return this.calling_code;
	}

	public final String getCalling_code() {
		return this.calling_codeProperty().get();
	}

	public final void setCalling_code(final String callingCode) {
		this.calling_codeProperty().set(callingCode);
	}

	public final BooleanProperty is_euProperty() {
		return this.is_eu;
	}

	public final boolean isIs_eu() {
		return this.is_euProperty().get();
	}

	public final void setIs_eu(final boolean isEu) {
		this.is_euProperty().set(isEu);
	}

}