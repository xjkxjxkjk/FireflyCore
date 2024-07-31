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

public final class FeverTimeActivityDataOuterClass {
  /**
   * Protobuf type {@code FeverTimeActivityData}
   */
  public static final class FeverTimeActivityData extends ProtoMessage<FeverTimeActivityData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 EDAMNPBBJHM = 6;</code>
     */
    private int eDAMNPBBJHM;

    /**
     * <code>optional uint32 KJBIAEAEMJF = 8;</code>
     */
    private int kJBIAEAEMJF;

    /**
     * <code>optional .FeverTimeActivityType activity_data_type = 10;</code>
     */
    private int activityDataType;

    private FeverTimeActivityData() {
    }

    /**
     * @return a new empty instance of {@code FeverTimeActivityData}
     */
    public static FeverTimeActivityData newInstance() {
      return new FeverTimeActivityData();
    }

    /**
     * <code>optional uint32 EDAMNPBBJHM = 6;</code>
     * @return whether the eDAMNPBBJHM field is set
     */
    public boolean hasEDAMNPBBJHM() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 EDAMNPBBJHM = 6;</code>
     * @return this
     */
    public FeverTimeActivityData clearEDAMNPBBJHM() {
      bitField0_ &= ~0x00000001;
      eDAMNPBBJHM = 0;
      return this;
    }

    /**
     * <code>optional uint32 EDAMNPBBJHM = 6;</code>
     * @return the eDAMNPBBJHM
     */
    public int getEDAMNPBBJHM() {
      return eDAMNPBBJHM;
    }

    /**
     * <code>optional uint32 EDAMNPBBJHM = 6;</code>
     * @param value the eDAMNPBBJHM to set
     * @return this
     */
    public FeverTimeActivityData setEDAMNPBBJHM(final int value) {
      bitField0_ |= 0x00000001;
      eDAMNPBBJHM = value;
      return this;
    }

    /**
     * <code>optional uint32 KJBIAEAEMJF = 8;</code>
     * @return whether the kJBIAEAEMJF field is set
     */
    public boolean hasKJBIAEAEMJF() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 KJBIAEAEMJF = 8;</code>
     * @return this
     */
    public FeverTimeActivityData clearKJBIAEAEMJF() {
      bitField0_ &= ~0x00000002;
      kJBIAEAEMJF = 0;
      return this;
    }

    /**
     * <code>optional uint32 KJBIAEAEMJF = 8;</code>
     * @return the kJBIAEAEMJF
     */
    public int getKJBIAEAEMJF() {
      return kJBIAEAEMJF;
    }

    /**
     * <code>optional uint32 KJBIAEAEMJF = 8;</code>
     * @param value the kJBIAEAEMJF to set
     * @return this
     */
    public FeverTimeActivityData setKJBIAEAEMJF(final int value) {
      bitField0_ |= 0x00000002;
      kJBIAEAEMJF = value;
      return this;
    }

    /**
     * <code>optional .FeverTimeActivityType activity_data_type = 10;</code>
     * @return whether the activityDataType field is set
     */
    public boolean hasActivityDataType() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .FeverTimeActivityType activity_data_type = 10;</code>
     * @return this
     */
    public FeverTimeActivityData clearActivityDataType() {
      bitField0_ &= ~0x00000004;
      activityDataType = 0;
      return this;
    }

    /**
     * <code>optional .FeverTimeActivityType activity_data_type = 10;</code>
     * @return the activityDataType
     */
    public FeverTimeActivityTypeOuterClass.FeverTimeActivityType getActivityDataType() {
      return FeverTimeActivityTypeOuterClass.FeverTimeActivityType.forNumber(activityDataType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link FeverTimeActivityData#getActivityDataType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getActivityDataTypeValue() {
      return activityDataType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link FeverTimeActivityTypeOuterClass.FeverTimeActivityType}. Setting an invalid value
     * can cause {@link FeverTimeActivityData#getActivityDataType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public FeverTimeActivityData setActivityDataTypeValue(final int value) {
      bitField0_ |= 0x00000004;
      activityDataType = value;
      return this;
    }

    /**
     * <code>optional .FeverTimeActivityType activity_data_type = 10;</code>
     * @param value the activityDataType to set
     * @return this
     */
    public FeverTimeActivityData setActivityDataType(
        final FeverTimeActivityTypeOuterClass.FeverTimeActivityType value) {
      bitField0_ |= 0x00000004;
      activityDataType = value.getNumber();
      return this;
    }

    @Override
    public FeverTimeActivityData copyFrom(final FeverTimeActivityData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        eDAMNPBBJHM = other.eDAMNPBBJHM;
        kJBIAEAEMJF = other.kJBIAEAEMJF;
        activityDataType = other.activityDataType;
      }
      return this;
    }

    @Override
    public FeverTimeActivityData mergeFrom(final FeverTimeActivityData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEDAMNPBBJHM()) {
        setEDAMNPBBJHM(other.eDAMNPBBJHM);
      }
      if (other.hasKJBIAEAEMJF()) {
        setKJBIAEAEMJF(other.kJBIAEAEMJF);
      }
      if (other.hasActivityDataType()) {
        setActivityDataTypeValue(other.activityDataType);
      }
      return this;
    }

    @Override
    public FeverTimeActivityData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      eDAMNPBBJHM = 0;
      kJBIAEAEMJF = 0;
      activityDataType = 0;
      return this;
    }

    @Override
    public FeverTimeActivityData clearQuick() {
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
      if (!(o instanceof FeverTimeActivityData)) {
        return false;
      }
      FeverTimeActivityData other = (FeverTimeActivityData) o;
      return bitField0_ == other.bitField0_
        && (!hasEDAMNPBBJHM() || eDAMNPBBJHM == other.eDAMNPBBJHM)
        && (!hasKJBIAEAEMJF() || kJBIAEAEMJF == other.kJBIAEAEMJF)
        && (!hasActivityDataType() || activityDataType == other.activityDataType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(eDAMNPBBJHM);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(kJBIAEAEMJF);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeEnumNoTag(activityDataType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(eDAMNPBBJHM);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(kJBIAEAEMJF);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(activityDataType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public FeverTimeActivityData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // eDAMNPBBJHM
            eDAMNPBBJHM = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // kJBIAEAEMJF
            kJBIAEAEMJF = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // activityDataType
            final int value = input.readInt32();
            if (FeverTimeActivityTypeOuterClass.FeverTimeActivityType.forNumber(value) != null) {
              activityDataType = value;
              bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.eDAMNPBBJHM, eDAMNPBBJHM);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.kJBIAEAEMJF, kJBIAEAEMJF);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeEnum(FieldNames.activityDataType, activityDataType, FeverTimeActivityTypeOuterClass.FeverTimeActivityType.converter());
      }
      output.endObject();
    }

    @Override
    public FeverTimeActivityData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1817454942: {
            if (input.isAtField(FieldNames.eDAMNPBBJHM)) {
              if (!input.trySkipNullValue()) {
                eDAMNPBBJHM = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -50501285: {
            if (input.isAtField(FieldNames.kJBIAEAEMJF)) {
              if (!input.trySkipNullValue()) {
                kJBIAEAEMJF = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 908650035:
          case 473381247: {
            if (input.isAtField(FieldNames.activityDataType)) {
              if (!input.trySkipNullValue()) {
                final FeverTimeActivityTypeOuterClass.FeverTimeActivityType value = input.readEnum(FeverTimeActivityTypeOuterClass.FeverTimeActivityType.converter());
                if (value != null) {
                  activityDataType = value.getNumber();
                  bitField0_ |= 0x00000004;
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
    public FeverTimeActivityData clone() {
      return new FeverTimeActivityData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static FeverTimeActivityData parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new FeverTimeActivityData(), data).checkInitialized();
    }

    public static FeverTimeActivityData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FeverTimeActivityData(), input).checkInitialized();
    }

    public static FeverTimeActivityData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FeverTimeActivityData(), input).checkInitialized();
    }

    /**
     * @return factory for creating FeverTimeActivityData messages
     */
    public static MessageFactory<FeverTimeActivityData> getFactory() {
      return FeverTimeActivityDataFactory.INSTANCE;
    }

    private enum FeverTimeActivityDataFactory implements MessageFactory<FeverTimeActivityData> {
      INSTANCE;

      @Override
      public FeverTimeActivityData create() {
        return FeverTimeActivityData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName eDAMNPBBJHM = FieldName.forField("EDAMNPBBJHM");

      static final FieldName kJBIAEAEMJF = FieldName.forField("KJBIAEAEMJF");

      static final FieldName activityDataType = FieldName.forField("activityDataType", "activity_data_type");
    }
  }
}
