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

public final class PlayerDisplaySettingsOuterClass {
  /**
   * <pre>
   *  Kbfenhoeolk
   * </pre>
   *
   * Protobuf type {@code PlayerDisplaySettings}
   */
  public static final class PlayerDisplaySettings extends ProtoMessage<PlayerDisplaySettings> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  bool amgbjcgchle = 3;
     * </pre>
     *
     * <code>optional .DisplayRecordType display_record_type = 10;</code>
     */
    private int displayRecordType;

    private PlayerDisplaySettings() {
    }

    /**
     * <pre>
     *  Kbfenhoeolk
     * </pre>
     *
     * @return a new empty instance of {@code PlayerDisplaySettings}
     */
    public static PlayerDisplaySettings newInstance() {
      return new PlayerDisplaySettings();
    }

    /**
     * <pre>
     *  bool amgbjcgchle = 3;
     * </pre>
     *
     * <code>optional .DisplayRecordType display_record_type = 10;</code>
     * @return whether the displayRecordType field is set
     */
    public boolean hasDisplayRecordType() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  bool amgbjcgchle = 3;
     * </pre>
     *
     * <code>optional .DisplayRecordType display_record_type = 10;</code>
     * @return this
     */
    public PlayerDisplaySettings clearDisplayRecordType() {
      bitField0_ &= ~0x00000001;
      displayRecordType = 0;
      return this;
    }

    /**
     * <pre>
     *  bool amgbjcgchle = 3;
     * </pre>
     *
     * <code>optional .DisplayRecordType display_record_type = 10;</code>
     * @return the displayRecordType
     */
    public DisplayRecordTypeOuterClass.DisplayRecordType getDisplayRecordType() {
      return DisplayRecordTypeOuterClass.DisplayRecordType.forNumber(displayRecordType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link PlayerDisplaySettings#getDisplayRecordType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getDisplayRecordTypeValue() {
      return displayRecordType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link DisplayRecordTypeOuterClass.DisplayRecordType}. Setting an invalid value
     * can cause {@link PlayerDisplaySettings#getDisplayRecordType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public PlayerDisplaySettings setDisplayRecordTypeValue(final int value) {
      bitField0_ |= 0x00000001;
      displayRecordType = value;
      return this;
    }

    /**
     * <pre>
     *  bool amgbjcgchle = 3;
     * </pre>
     *
     * <code>optional .DisplayRecordType display_record_type = 10;</code>
     * @param value the displayRecordType to set
     * @return this
     */
    public PlayerDisplaySettings setDisplayRecordType(
        final DisplayRecordTypeOuterClass.DisplayRecordType value) {
      bitField0_ |= 0x00000001;
      displayRecordType = value.getNumber();
      return this;
    }

    @Override
    public PlayerDisplaySettings copyFrom(final PlayerDisplaySettings other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        displayRecordType = other.displayRecordType;
      }
      return this;
    }

    @Override
    public PlayerDisplaySettings mergeFrom(final PlayerDisplaySettings other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDisplayRecordType()) {
        setDisplayRecordTypeValue(other.displayRecordType);
      }
      return this;
    }

    @Override
    public PlayerDisplaySettings clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      displayRecordType = 0;
      return this;
    }

    @Override
    public PlayerDisplaySettings clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PlayerDisplaySettings)) {
        return false;
      }
      PlayerDisplaySettings other = (PlayerDisplaySettings) o;
      return bitField0_ == other.bitField0_
        && (!hasDisplayRecordType() || displayRecordType == other.displayRecordType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeEnumNoTag(displayRecordType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(displayRecordType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayerDisplaySettings mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // displayRecordType
            final int value = input.readInt32();
            if (DisplayRecordTypeOuterClass.DisplayRecordType.forNumber(value) != null) {
              displayRecordType = value;
              bitField0_ |= 0x00000001;
            }
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
        output.writeEnum(FieldNames.displayRecordType, displayRecordType, DisplayRecordTypeOuterClass.DisplayRecordType.converter());
      }
      output.endObject();
    }

    @Override
    public PlayerDisplaySettings mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1038726771:
          case 1165970027: {
            if (input.isAtField(FieldNames.displayRecordType)) {
              if (!input.trySkipNullValue()) {
                final DisplayRecordTypeOuterClass.DisplayRecordType value = input.readEnum(DisplayRecordTypeOuterClass.DisplayRecordType.converter());
                if (value != null) {
                  displayRecordType = value.getNumber();
                  bitField0_ |= 0x00000001;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public PlayerDisplaySettings clone() {
      return new PlayerDisplaySettings().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayerDisplaySettings parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayerDisplaySettings(), data).checkInitialized();
    }

    public static PlayerDisplaySettings parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerDisplaySettings(), input).checkInitialized();
    }

    public static PlayerDisplaySettings parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerDisplaySettings(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayerDisplaySettings messages
     */
    public static MessageFactory<PlayerDisplaySettings> getFactory() {
      return PlayerDisplaySettingsFactory.INSTANCE;
    }

    private enum PlayerDisplaySettingsFactory implements MessageFactory<PlayerDisplaySettings> {
      INSTANCE;

      @Override
      public PlayerDisplaySettings create() {
        return PlayerDisplaySettings.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName displayRecordType = FieldName.forField("displayRecordType", "display_record_type");
    }
  }
}