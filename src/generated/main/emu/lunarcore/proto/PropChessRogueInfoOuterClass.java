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

public final class PropChessRogueInfoOuterClass {
  /**
   * Protobuf type {@code PropChessRogueInfo}
   */
  public static final class PropChessRogueInfo extends ProtoMessage<PropChessRogueInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional bool FAHMIGDFDNP = 13;</code>
     */
    private boolean fAHMIGDFDNP;

    /**
     * <code>optional bool EECMOOFDCPF = 15;</code>
     */
    private boolean eECMOOFDCPF;

    private PropChessRogueInfo() {
    }

    /**
     * @return a new empty instance of {@code PropChessRogueInfo}
     */
    public static PropChessRogueInfo newInstance() {
      return new PropChessRogueInfo();
    }

    /**
     * <code>optional bool FAHMIGDFDNP = 13;</code>
     * @return whether the fAHMIGDFDNP field is set
     */
    public boolean hasFAHMIGDFDNP() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional bool FAHMIGDFDNP = 13;</code>
     * @return this
     */
    public PropChessRogueInfo clearFAHMIGDFDNP() {
      bitField0_ &= ~0x00000001;
      fAHMIGDFDNP = false;
      return this;
    }

    /**
     * <code>optional bool FAHMIGDFDNP = 13;</code>
     * @return the fAHMIGDFDNP
     */
    public boolean getFAHMIGDFDNP() {
      return fAHMIGDFDNP;
    }

    /**
     * <code>optional bool FAHMIGDFDNP = 13;</code>
     * @param value the fAHMIGDFDNP to set
     * @return this
     */
    public PropChessRogueInfo setFAHMIGDFDNP(final boolean value) {
      bitField0_ |= 0x00000001;
      fAHMIGDFDNP = value;
      return this;
    }

    /**
     * <code>optional bool EECMOOFDCPF = 15;</code>
     * @return whether the eECMOOFDCPF field is set
     */
    public boolean hasEECMOOFDCPF() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool EECMOOFDCPF = 15;</code>
     * @return this
     */
    public PropChessRogueInfo clearEECMOOFDCPF() {
      bitField0_ &= ~0x00000002;
      eECMOOFDCPF = false;
      return this;
    }

    /**
     * <code>optional bool EECMOOFDCPF = 15;</code>
     * @return the eECMOOFDCPF
     */
    public boolean getEECMOOFDCPF() {
      return eECMOOFDCPF;
    }

    /**
     * <code>optional bool EECMOOFDCPF = 15;</code>
     * @param value the eECMOOFDCPF to set
     * @return this
     */
    public PropChessRogueInfo setEECMOOFDCPF(final boolean value) {
      bitField0_ |= 0x00000002;
      eECMOOFDCPF = value;
      return this;
    }

    @Override
    public PropChessRogueInfo copyFrom(final PropChessRogueInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        fAHMIGDFDNP = other.fAHMIGDFDNP;
        eECMOOFDCPF = other.eECMOOFDCPF;
      }
      return this;
    }

    @Override
    public PropChessRogueInfo mergeFrom(final PropChessRogueInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasFAHMIGDFDNP()) {
        setFAHMIGDFDNP(other.fAHMIGDFDNP);
      }
      if (other.hasEECMOOFDCPF()) {
        setEECMOOFDCPF(other.eECMOOFDCPF);
      }
      return this;
    }

    @Override
    public PropChessRogueInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      fAHMIGDFDNP = false;
      eECMOOFDCPF = false;
      return this;
    }

    @Override
    public PropChessRogueInfo clearQuick() {
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
      if (!(o instanceof PropChessRogueInfo)) {
        return false;
      }
      PropChessRogueInfo other = (PropChessRogueInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasFAHMIGDFDNP() || fAHMIGDFDNP == other.fAHMIGDFDNP)
        && (!hasEECMOOFDCPF() || eECMOOFDCPF == other.eECMOOFDCPF);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 104);
        output.writeBoolNoTag(fAHMIGDFDNP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeBoolNoTag(eECMOOFDCPF);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PropChessRogueInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 104: {
            // fAHMIGDFDNP
            fAHMIGDFDNP = input.readBool();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // eECMOOFDCPF
            eECMOOFDCPF = input.readBool();
            bitField0_ |= 0x00000002;
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
        output.writeBool(FieldNames.fAHMIGDFDNP, fAHMIGDFDNP);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.eECMOOFDCPF, eECMOOFDCPF);
      }
      output.endObject();
    }

    @Override
    public PropChessRogueInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1104569318: {
            if (input.isAtField(FieldNames.fAHMIGDFDNP)) {
              if (!input.trySkipNullValue()) {
                fAHMIGDFDNP = input.readBool();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -471288367: {
            if (input.isAtField(FieldNames.eECMOOFDCPF)) {
              if (!input.trySkipNullValue()) {
                eECMOOFDCPF = input.readBool();
                bitField0_ |= 0x00000002;
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
    public PropChessRogueInfo clone() {
      return new PropChessRogueInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PropChessRogueInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PropChessRogueInfo(), data).checkInitialized();
    }

    public static PropChessRogueInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PropChessRogueInfo(), input).checkInitialized();
    }

    public static PropChessRogueInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PropChessRogueInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating PropChessRogueInfo messages
     */
    public static MessageFactory<PropChessRogueInfo> getFactory() {
      return PropChessRogueInfoFactory.INSTANCE;
    }

    private enum PropChessRogueInfoFactory implements MessageFactory<PropChessRogueInfo> {
      INSTANCE;

      @Override
      public PropChessRogueInfo create() {
        return PropChessRogueInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName fAHMIGDFDNP = FieldName.forField("FAHMIGDFDNP");

      static final FieldName eECMOOFDCPF = FieldName.forField("EECMOOFDCPF");
    }
  }
}