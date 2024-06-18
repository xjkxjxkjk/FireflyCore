// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.Utf8String;

public final class RegionEntryOuterClass {
  /**
   * <pre>
   *  MFBLAIIBJGI
   * </pre>
   *
   * Protobuf type {@code RegionEntry}
   */
  public static final class RegionEntry extends ProtoMessage<RegionEntry> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional string name = 1;</code>
     */
    private final Utf8String name = Utf8String.newEmptyInstance();

    /**
     * <pre>
     *  FCNKBJLFIHP
     * </pre>
     *
     * <code>optional string title = 2;</code>
     */
    private final Utf8String title = Utf8String.newEmptyInstance();

    /**
     * <pre>
     *  CKGBENAGHHH
     * </pre>
     *
     * <code>optional string dispatch_url = 3;</code>
     */
    private final Utf8String dispatchUrl = Utf8String.newEmptyInstance();

    /**
     * <pre>
     *  GHOHIFALJPP
     * </pre>
     *
     * <code>optional string env_type = 4;</code>
     */
    private final Utf8String envType = Utf8String.newEmptyInstance();

    /**
     * <pre>
     *  HLBOPNAOMPD
     * </pre>
     *
     * <code>optional string display_name = 5;</code>
     */
    private final Utf8String displayName = Utf8String.newEmptyInstance();

    /**
     * <code>optional string msg = 6;</code>
     */
    private final Utf8String msg = Utf8String.newEmptyInstance();

    private RegionEntry() {
    }

    /**
     * <pre>
     *  MFBLAIIBJGI
     * </pre>
     *
     * @return a new empty instance of {@code RegionEntry}
     */
    public static RegionEntry newInstance() {
      return new RegionEntry();
    }

    /**
     * <code>optional string name = 1;</code>
     * @return whether the name field is set
     */
    public boolean hasName() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional string name = 1;</code>
     * @return this
     */
    public RegionEntry clearName() {
      bitField0_ &= ~0x00000001;
      name.clear();
      return this;
    }

    /**
     * <code>optional string name = 1;</code>
     * @return the name
     */
    public String getName() {
      return name.getString();
    }

    /**
     * <code>optional string name = 1;</code>
     * @return internal {@code Utf8String} representation of name for reading
     */
    public Utf8String getNameBytes() {
      return this.name;
    }

    /**
     * <code>optional string name = 1;</code>
     * @return internal {@code Utf8String} representation of name for modifications
     */
    public Utf8String getMutableNameBytes() {
      bitField0_ |= 0x00000001;
      return this.name;
    }

    /**
     * <code>optional string name = 1;</code>
     * @param value the name to set
     * @return this
     */
    public RegionEntry setName(final CharSequence value) {
      bitField0_ |= 0x00000001;
      name.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string name = 1;</code>
     * @param value the name to set
     * @return this
     */
    public RegionEntry setName(final Utf8String value) {
      bitField0_ |= 0x00000001;
      name.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  FCNKBJLFIHP
     * </pre>
     *
     * <code>optional string title = 2;</code>
     * @return whether the title field is set
     */
    public boolean hasTitle() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  FCNKBJLFIHP
     * </pre>
     *
     * <code>optional string title = 2;</code>
     * @return this
     */
    public RegionEntry clearTitle() {
      bitField0_ &= ~0x00000002;
      title.clear();
      return this;
    }

    /**
     * <pre>
     *  FCNKBJLFIHP
     * </pre>
     *
     * <code>optional string title = 2;</code>
     * @return the title
     */
    public String getTitle() {
      return title.getString();
    }

    /**
     * <pre>
     *  FCNKBJLFIHP
     * </pre>
     *
     * <code>optional string title = 2;</code>
     * @return internal {@code Utf8String} representation of title for reading
     */
    public Utf8String getTitleBytes() {
      return this.title;
    }

    /**
     * <pre>
     *  FCNKBJLFIHP
     * </pre>
     *
     * <code>optional string title = 2;</code>
     * @return internal {@code Utf8String} representation of title for modifications
     */
    public Utf8String getMutableTitleBytes() {
      bitField0_ |= 0x00000002;
      return this.title;
    }

    /**
     * <pre>
     *  FCNKBJLFIHP
     * </pre>
     *
     * <code>optional string title = 2;</code>
     * @param value the title to set
     * @return this
     */
    public RegionEntry setTitle(final CharSequence value) {
      bitField0_ |= 0x00000002;
      title.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  FCNKBJLFIHP
     * </pre>
     *
     * <code>optional string title = 2;</code>
     * @param value the title to set
     * @return this
     */
    public RegionEntry setTitle(final Utf8String value) {
      bitField0_ |= 0x00000002;
      title.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  CKGBENAGHHH
     * </pre>
     *
     * <code>optional string dispatch_url = 3;</code>
     * @return whether the dispatchUrl field is set
     */
    public boolean hasDispatchUrl() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  CKGBENAGHHH
     * </pre>
     *
     * <code>optional string dispatch_url = 3;</code>
     * @return this
     */
    public RegionEntry clearDispatchUrl() {
      bitField0_ &= ~0x00000004;
      dispatchUrl.clear();
      return this;
    }

    /**
     * <pre>
     *  CKGBENAGHHH
     * </pre>
     *
     * <code>optional string dispatch_url = 3;</code>
     * @return the dispatchUrl
     */
    public String getDispatchUrl() {
      return dispatchUrl.getString();
    }

    /**
     * <pre>
     *  CKGBENAGHHH
     * </pre>
     *
     * <code>optional string dispatch_url = 3;</code>
     * @return internal {@code Utf8String} representation of dispatchUrl for reading
     */
    public Utf8String getDispatchUrlBytes() {
      return this.dispatchUrl;
    }

    /**
     * <pre>
     *  CKGBENAGHHH
     * </pre>
     *
     * <code>optional string dispatch_url = 3;</code>
     * @return internal {@code Utf8String} representation of dispatchUrl for modifications
     */
    public Utf8String getMutableDispatchUrlBytes() {
      bitField0_ |= 0x00000004;
      return this.dispatchUrl;
    }

    /**
     * <pre>
     *  CKGBENAGHHH
     * </pre>
     *
     * <code>optional string dispatch_url = 3;</code>
     * @param value the dispatchUrl to set
     * @return this
     */
    public RegionEntry setDispatchUrl(final CharSequence value) {
      bitField0_ |= 0x00000004;
      dispatchUrl.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  CKGBENAGHHH
     * </pre>
     *
     * <code>optional string dispatch_url = 3;</code>
     * @param value the dispatchUrl to set
     * @return this
     */
    public RegionEntry setDispatchUrl(final Utf8String value) {
      bitField0_ |= 0x00000004;
      dispatchUrl.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  GHOHIFALJPP
     * </pre>
     *
     * <code>optional string env_type = 4;</code>
     * @return whether the envType field is set
     */
    public boolean hasEnvType() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *  GHOHIFALJPP
     * </pre>
     *
     * <code>optional string env_type = 4;</code>
     * @return this
     */
    public RegionEntry clearEnvType() {
      bitField0_ &= ~0x00000008;
      envType.clear();
      return this;
    }

    /**
     * <pre>
     *  GHOHIFALJPP
     * </pre>
     *
     * <code>optional string env_type = 4;</code>
     * @return the envType
     */
    public String getEnvType() {
      return envType.getString();
    }

    /**
     * <pre>
     *  GHOHIFALJPP
     * </pre>
     *
     * <code>optional string env_type = 4;</code>
     * @return internal {@code Utf8String} representation of envType for reading
     */
    public Utf8String getEnvTypeBytes() {
      return this.envType;
    }

    /**
     * <pre>
     *  GHOHIFALJPP
     * </pre>
     *
     * <code>optional string env_type = 4;</code>
     * @return internal {@code Utf8String} representation of envType for modifications
     */
    public Utf8String getMutableEnvTypeBytes() {
      bitField0_ |= 0x00000008;
      return this.envType;
    }

    /**
     * <pre>
     *  GHOHIFALJPP
     * </pre>
     *
     * <code>optional string env_type = 4;</code>
     * @param value the envType to set
     * @return this
     */
    public RegionEntry setEnvType(final CharSequence value) {
      bitField0_ |= 0x00000008;
      envType.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  GHOHIFALJPP
     * </pre>
     *
     * <code>optional string env_type = 4;</code>
     * @param value the envType to set
     * @return this
     */
    public RegionEntry setEnvType(final Utf8String value) {
      bitField0_ |= 0x00000008;
      envType.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  HLBOPNAOMPD
     * </pre>
     *
     * <code>optional string display_name = 5;</code>
     * @return whether the displayName field is set
     */
    public boolean hasDisplayName() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     *  HLBOPNAOMPD
     * </pre>
     *
     * <code>optional string display_name = 5;</code>
     * @return this
     */
    public RegionEntry clearDisplayName() {
      bitField0_ &= ~0x00000010;
      displayName.clear();
      return this;
    }

    /**
     * <pre>
     *  HLBOPNAOMPD
     * </pre>
     *
     * <code>optional string display_name = 5;</code>
     * @return the displayName
     */
    public String getDisplayName() {
      return displayName.getString();
    }

    /**
     * <pre>
     *  HLBOPNAOMPD
     * </pre>
     *
     * <code>optional string display_name = 5;</code>
     * @return internal {@code Utf8String} representation of displayName for reading
     */
    public Utf8String getDisplayNameBytes() {
      return this.displayName;
    }

    /**
     * <pre>
     *  HLBOPNAOMPD
     * </pre>
     *
     * <code>optional string display_name = 5;</code>
     * @return internal {@code Utf8String} representation of displayName for modifications
     */
    public Utf8String getMutableDisplayNameBytes() {
      bitField0_ |= 0x00000010;
      return this.displayName;
    }

    /**
     * <pre>
     *  HLBOPNAOMPD
     * </pre>
     *
     * <code>optional string display_name = 5;</code>
     * @param value the displayName to set
     * @return this
     */
    public RegionEntry setDisplayName(final CharSequence value) {
      bitField0_ |= 0x00000010;
      displayName.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  HLBOPNAOMPD
     * </pre>
     *
     * <code>optional string display_name = 5;</code>
     * @param value the displayName to set
     * @return this
     */
    public RegionEntry setDisplayName(final Utf8String value) {
      bitField0_ |= 0x00000010;
      displayName.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string msg = 6;</code>
     * @return whether the msg field is set
     */
    public boolean hasMsg() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional string msg = 6;</code>
     * @return this
     */
    public RegionEntry clearMsg() {
      bitField0_ &= ~0x00000020;
      msg.clear();
      return this;
    }

    /**
     * <code>optional string msg = 6;</code>
     * @return the msg
     */
    public String getMsg() {
      return msg.getString();
    }

    /**
     * <code>optional string msg = 6;</code>
     * @return internal {@code Utf8String} representation of msg for reading
     */
    public Utf8String getMsgBytes() {
      return this.msg;
    }

    /**
     * <code>optional string msg = 6;</code>
     * @return internal {@code Utf8String} representation of msg for modifications
     */
    public Utf8String getMutableMsgBytes() {
      bitField0_ |= 0x00000020;
      return this.msg;
    }

    /**
     * <code>optional string msg = 6;</code>
     * @param value the msg to set
     * @return this
     */
    public RegionEntry setMsg(final CharSequence value) {
      bitField0_ |= 0x00000020;
      msg.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string msg = 6;</code>
     * @param value the msg to set
     * @return this
     */
    public RegionEntry setMsg(final Utf8String value) {
      bitField0_ |= 0x00000020;
      msg.copyFrom(value);
      return this;
    }

    @Override
    public RegionEntry copyFrom(final RegionEntry other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        name.copyFrom(other.name);
        title.copyFrom(other.title);
        dispatchUrl.copyFrom(other.dispatchUrl);
        envType.copyFrom(other.envType);
        displayName.copyFrom(other.displayName);
        msg.copyFrom(other.msg);
      }
      return this;
    }

    @Override
    public RegionEntry mergeFrom(final RegionEntry other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasName()) {
        getMutableNameBytes().copyFrom(other.name);
      }
      if (other.hasTitle()) {
        getMutableTitleBytes().copyFrom(other.title);
      }
      if (other.hasDispatchUrl()) {
        getMutableDispatchUrlBytes().copyFrom(other.dispatchUrl);
      }
      if (other.hasEnvType()) {
        getMutableEnvTypeBytes().copyFrom(other.envType);
      }
      if (other.hasDisplayName()) {
        getMutableDisplayNameBytes().copyFrom(other.displayName);
      }
      if (other.hasMsg()) {
        getMutableMsgBytes().copyFrom(other.msg);
      }
      return this;
    }

    @Override
    public RegionEntry clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      name.clear();
      title.clear();
      dispatchUrl.clear();
      envType.clear();
      displayName.clear();
      msg.clear();
      return this;
    }

    @Override
    public RegionEntry clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      name.clear();
      title.clear();
      dispatchUrl.clear();
      envType.clear();
      displayName.clear();
      msg.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RegionEntry)) {
        return false;
      }
      RegionEntry other = (RegionEntry) o;
      return bitField0_ == other.bitField0_
        && (!hasName() || name.equals(other.name))
        && (!hasTitle() || title.equals(other.title))
        && (!hasDispatchUrl() || dispatchUrl.equals(other.dispatchUrl))
        && (!hasEnvType() || envType.equals(other.envType))
        && (!hasDisplayName() || displayName.equals(other.displayName))
        && (!hasMsg() || msg.equals(other.msg));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 10);
        output.writeStringNoTag(name);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 18);
        output.writeStringNoTag(title);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 26);
        output.writeStringNoTag(dispatchUrl);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 34);
        output.writeStringNoTag(envType);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 42);
        output.writeStringNoTag(displayName);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 50);
        output.writeStringNoTag(msg);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(name);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(title);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(dispatchUrl);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(envType);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(displayName);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(msg);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RegionEntry mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 10: {
            // name
            input.readString(name);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // title
            input.readString(title);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // dispatchUrl
            input.readString(dispatchUrl);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // envType
            input.readString(envType);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // displayName
            input.readString(displayName);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // msg
            input.readString(msg);
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeString(FieldNames.name, name);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeString(FieldNames.title, title);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeString(FieldNames.dispatchUrl, dispatchUrl);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeString(FieldNames.envType, envType);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeString(FieldNames.displayName, displayName);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeString(FieldNames.msg, msg);
      }
      output.endObject();
    }

    @Override
    public RegionEntry mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3373707: {
            if (input.isAtField(FieldNames.name)) {
              if (!input.trySkipNullValue()) {
                input.readString(name);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 110371416: {
            if (input.isAtField(FieldNames.title)) {
              if (!input.trySkipNullValue()) {
                input.readString(title);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1065942677:
          case -1315214294: {
            if (input.isAtField(FieldNames.dispatchUrl)) {
              if (!input.trySkipNullValue()) {
                input.readString(dispatchUrl);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1590604345:
          case -2054075572: {
            if (input.isAtField(FieldNames.envType)) {
              if (!input.trySkipNullValue()) {
                input.readString(envType);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1714148973:
          case 1615086568: {
            if (input.isAtField(FieldNames.displayName)) {
              if (!input.trySkipNullValue()) {
                input.readString(displayName);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 108417: {
            if (input.isAtField(FieldNames.msg)) {
              if (!input.trySkipNullValue()) {
                input.readString(msg);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RegionEntry clone() {
      return new RegionEntry().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RegionEntry parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RegionEntry(), data).checkInitialized();
    }

    public static RegionEntry parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RegionEntry(), input).checkInitialized();
    }

    public static RegionEntry parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RegionEntry(), input).checkInitialized();
    }

    /**
     * @return factory for creating RegionEntry messages
     */
    public static MessageFactory<RegionEntry> getFactory() {
      return RegionEntryFactory.INSTANCE;
    }

    private enum RegionEntryFactory implements MessageFactory<RegionEntry> {
      INSTANCE;

      @Override
      public RegionEntry create() {
        return RegionEntry.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName name = FieldName.forField("name");

      static final FieldName title = FieldName.forField("title");

      static final FieldName dispatchUrl = FieldName.forField("dispatchUrl", "dispatch_url");

      static final FieldName envType = FieldName.forField("envType", "env_type");

      static final FieldName displayName = FieldName.forField("displayName", "display_name");

      static final FieldName msg = FieldName.forField("msg");
    }
  }
}