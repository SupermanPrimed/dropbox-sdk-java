/* DO NOT EDIT */
/* This file was generated from openid_openid_types.stone */

package com.dropbox.core.v2.openid;

import com.dropbox.core.stone.StoneDeserializerLogger;
import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.util.Arrays;

/**
 * This class is an open tagged union.  Tagged unions instances are always
 * associated to a specific tag.  This means only one of the {@code isAbc()}
 * methods will return {@code true}. You can use {@link #tag()} to determine the
 * tag associated with this instance.
 *
 * <p> Open unions may be extended in the future with additional tags. If a new
 * tag is introduced that this SDK does not recognized, the {@link #OTHER} value
 * will be used. </p>
 */
public final class ErrUnion {
    // union openid.err_union (openid_openid_types.stone)

    /**
     * Discriminating tag type for {@link ErrUnion}.
     */
    public enum Tag {
        AUTH_ERROR, // AuthError
        /**
         * Catch-all used for unknown tag values returned by the Dropbox
         * servers.
         *
         * <p> Receiving a catch-all value typically indicates this SDK version
         * is not up to date. Consider updating your SDK version to handle the
         * new tags. </p>
         */
        OTHER; // *catch_all
    }

    /**
     * Catch-all used for unknown tag values returned by the Dropbox servers.
     *
     * <p> Receiving a catch-all value typically indicates this SDK version is
     * not up to date. Consider updating your SDK version to handle the new
     * tags. </p>
     */
    public static final ErrUnion OTHER = new ErrUnion().withTag(Tag.OTHER);

    private Tag _tag;
    private AuthError authErrorValue;

    /**
     * Private default constructor, so that object is uninitializable publicly.
     */
    private ErrUnion() {
    }


    /**
     *
     * @param _tag  Discriminating tag for this instance.
     */
    private ErrUnion withTag(Tag _tag) {
        ErrUnion result = new ErrUnion();
        result._tag = _tag;
        return result;
    }

    /**
     *
     * @param authErrorValue  Must not be {@code null}.
     * @param _tag  Discriminating tag for this instance.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    private ErrUnion withTagAndAuthError(Tag _tag, AuthError authErrorValue) {
        ErrUnion result = new ErrUnion();
        result._tag = _tag;
        result.authErrorValue = authErrorValue;
        return result;
    }

    /**
     * Returns the tag for this instance.
     *
     * <p> This class is a tagged union.  Tagged unions instances are always
     * associated to a specific tag.  This means only one of the {@code isXyz()}
     * methods will return {@code true}. Callers are recommended to use the tag
     * value in a {@code switch} statement to properly handle the different
     * values for this {@code ErrUnion}. </p>
     *
     * <p> If a tag returned by the server is unrecognized by this SDK, the
     * {@link Tag#OTHER} value will be used. </p>
     *
     * @return the tag for this instance.
     */
    public Tag tag() {
        return _tag;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#AUTH_ERROR},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#AUTH_ERROR}, {@code false} otherwise.
     */
    public boolean isAuthError() {
        return this._tag == Tag.AUTH_ERROR;
    }

    /**
     * Returns an instance of {@code ErrUnion} that has its tag set to {@link
     * Tag#AUTH_ERROR}.
     *
     * <p> None </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code ErrUnion} with its tag set to {@link
     *     Tag#AUTH_ERROR}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static ErrUnion authError(AuthError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new ErrUnion().withTagAndAuthError(Tag.AUTH_ERROR, value);
    }

    /**
     * This instance must be tagged as {@link Tag#AUTH_ERROR}.
     *
     * @return The {@link AuthError} value associated with this instance if
     *     {@link #isAuthError} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isAuthError} is {@code false}.
     */
    public AuthError getAuthErrorValue() {
        if (this._tag != Tag.AUTH_ERROR) {
            throw new IllegalStateException("Invalid tag: required Tag.AUTH_ERROR, but was Tag." + this._tag.name());
        }
        return authErrorValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#OTHER},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#OTHER},
     *     {@code false} otherwise.
     */
    public boolean isOther() {
        return this._tag == Tag.OTHER;
    }

    @Override
    public int hashCode() {
        int hash = Arrays.hashCode(new Object [] {
            _tag,
            authErrorValue
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        else if (obj instanceof ErrUnion) {
            ErrUnion other = (ErrUnion) obj;
            if (this._tag != other._tag) {
                return false;
            }
            switch (_tag) {
                case AUTH_ERROR:
                    return (this.authErrorValue == other.authErrorValue) || (this.authErrorValue.equals(other.authErrorValue));
                case OTHER:
                    return true;
                default:
                    return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static class Serializer extends UnionSerializer<ErrUnion> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(ErrUnion value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value.tag()) {
                case AUTH_ERROR: {
                    g.writeStartObject();
                    writeTag("auth_error", g);
                    g.writeFieldName("auth_error");
                    AuthError.Serializer.INSTANCE.serialize(value.authErrorValue, g);
                    g.writeEndObject();
                    break;
                }
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public ErrUnion deserialize(JsonParser p) throws IOException, JsonParseException {
            ErrUnion value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else if ("auth_error".equals(tag)) {
                AuthError fieldValue = null;
                expectField("auth_error", p);
                fieldValue = AuthError.Serializer.INSTANCE.deserialize(p);
                value = ErrUnion.authError(fieldValue);
            }
            else {
                value = ErrUnion.OTHER;
            }
            if (!collapsed) {
                skipFields(p);
                expectEndObject(p);
            }
            return value;
        }
    }
}
