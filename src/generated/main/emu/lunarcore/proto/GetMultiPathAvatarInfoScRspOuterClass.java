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
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class GetMultiPathAvatarInfoScRspOuterClass {
  /**
   * <pre>
   *  MOJFLMMBKKC
   * </pre>
   *
   * Protobuf type {@code GetMultiPathAvatarInfoScRsp}
   */
  public static final class GetMultiPathAvatarInfoScRsp extends ProtoMessage<GetMultiPathAvatarInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    /**
     * <code>repeated uint32 GJKJLNLIEII = 15;</code>
     */
    private final RepeatedInt gJKJLNLIEII = RepeatedInt.newEmptyInstance();

    /**
     * <pre>
     *  repeated MultiPathAvatarTypeInfo GEJMKNPDGEM = 13;
     * </pre>
     *
     * <code>repeated .GetMultiPathAvatarInfoScRsp.DEKPBIGFNBEEntry DEKPBIGFNBE = 4;</code>
     */
    private final RepeatedMessage<DEKPBIGFNBEEntry> dEKPBIGFNBE = RepeatedMessage.newEmptyInstance(DEKPBIGFNBEEntry.getFactory());

    private GetMultiPathAvatarInfoScRsp() {
    }

    /**
     * <pre>
     *  MOJFLMMBKKC
     * </pre>
     *
     * @return a new empty instance of {@code GetMultiPathAvatarInfoScRsp}
     */
    public static GetMultiPathAvatarInfoScRsp newInstance() {
      return new GetMultiPathAvatarInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated uint32 GJKJLNLIEII = 15;</code>
     * @return whether the gJKJLNLIEII field is set
     */
    public boolean hasGJKJLNLIEII() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 GJKJLNLIEII = 15;</code>
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp clearGJKJLNLIEII() {
      bitField0_ &= ~0x00000002;
      gJKJLNLIEII.clear();
      return this;
    }

    /**
     * <code>repeated uint32 GJKJLNLIEII = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGJKJLNLIEII()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getGJKJLNLIEII() {
      return gJKJLNLIEII;
    }

    /**
     * <code>repeated uint32 GJKJLNLIEII = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableGJKJLNLIEII() {
      bitField0_ |= 0x00000002;
      return gJKJLNLIEII;
    }

    /**
     * <code>repeated uint32 GJKJLNLIEII = 15;</code>
     * @param value the gJKJLNLIEII to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addGJKJLNLIEII(final int value) {
      bitField0_ |= 0x00000002;
      gJKJLNLIEII.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 GJKJLNLIEII = 15;</code>
     * @param values the gJKJLNLIEII to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addAllGJKJLNLIEII(final int... values) {
      bitField0_ |= 0x00000002;
      gJKJLNLIEII.addAll(values);
      return this;
    }

    /**
     * <pre>
     *  repeated MultiPathAvatarTypeInfo GEJMKNPDGEM = 13;
     * </pre>
     *
     * <code>repeated .GetMultiPathAvatarInfoScRsp.DEKPBIGFNBEEntry DEKPBIGFNBE = 4;</code>
     * @return whether the dEKPBIGFNBE field is set
     */
    public boolean hasDEKPBIGFNBE() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  repeated MultiPathAvatarTypeInfo GEJMKNPDGEM = 13;
     * </pre>
     *
     * <code>repeated .GetMultiPathAvatarInfoScRsp.DEKPBIGFNBEEntry DEKPBIGFNBE = 4;</code>
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp clearDEKPBIGFNBE() {
      bitField0_ &= ~0x00000004;
      dEKPBIGFNBE.clear();
      return this;
    }

    /**
     * <pre>
     *  repeated MultiPathAvatarTypeInfo GEJMKNPDGEM = 13;
     * </pre>
     *
     * <code>repeated .GetMultiPathAvatarInfoScRsp.DEKPBIGFNBEEntry DEKPBIGFNBE = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDEKPBIGFNBE()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<DEKPBIGFNBEEntry> getDEKPBIGFNBE() {
      return dEKPBIGFNBE;
    }

    /**
     * <pre>
     *  repeated MultiPathAvatarTypeInfo GEJMKNPDGEM = 13;
     * </pre>
     *
     * <code>repeated .GetMultiPathAvatarInfoScRsp.DEKPBIGFNBEEntry DEKPBIGFNBE = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<DEKPBIGFNBEEntry> getMutableDEKPBIGFNBE() {
      bitField0_ |= 0x00000004;
      return dEKPBIGFNBE;
    }

    /**
     * <pre>
     *  repeated MultiPathAvatarTypeInfo GEJMKNPDGEM = 13;
     * </pre>
     *
     * <code>repeated .GetMultiPathAvatarInfoScRsp.DEKPBIGFNBEEntry DEKPBIGFNBE = 4;</code>
     * @param value the dEKPBIGFNBE to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addDEKPBIGFNBE(final DEKPBIGFNBEEntry value) {
      bitField0_ |= 0x00000004;
      dEKPBIGFNBE.add(value);
      return this;
    }

    /**
     * <pre>
     *  repeated MultiPathAvatarTypeInfo GEJMKNPDGEM = 13;
     * </pre>
     *
     * <code>repeated .GetMultiPathAvatarInfoScRsp.DEKPBIGFNBEEntry DEKPBIGFNBE = 4;</code>
     * @param values the dEKPBIGFNBE to add
     * @return this
     */
    public GetMultiPathAvatarInfoScRsp addAllDEKPBIGFNBE(final DEKPBIGFNBEEntry... values) {
      bitField0_ |= 0x00000004;
      dEKPBIGFNBE.addAll(values);
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp copyFrom(final GetMultiPathAvatarInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        gJKJLNLIEII.copyFrom(other.gJKJLNLIEII);
        dEKPBIGFNBE.copyFrom(other.dEKPBIGFNBE);
      }
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp mergeFrom(final GetMultiPathAvatarInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasGJKJLNLIEII()) {
        getMutableGJKJLNLIEII().addAll(other.gJKJLNLIEII);
      }
      if (other.hasDEKPBIGFNBE()) {
        getMutableDEKPBIGFNBE().addAll(other.dEKPBIGFNBE);
      }
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      gJKJLNLIEII.clear();
      dEKPBIGFNBE.clear();
      return this;
    }

    @Override
    public GetMultiPathAvatarInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gJKJLNLIEII.clear();
      dEKPBIGFNBE.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetMultiPathAvatarInfoScRsp)) {
        return false;
      }
      GetMultiPathAvatarInfoScRsp other = (GetMultiPathAvatarInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasGJKJLNLIEII() || gJKJLNLIEII.equals(other.gJKJLNLIEII))
        && (!hasDEKPBIGFNBE() || dEKPBIGFNBE.equals(other.dEKPBIGFNBE));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < gJKJLNLIEII.length(); i++) {
          output.writeRawByte((byte) 120);
          output.writeUInt32NoTag(gJKJLNLIEII.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < dEKPBIGFNBE.length(); i++) {
          output.writeRawByte((byte) 34);
          output.writeMessageNoTag(dEKPBIGFNBE.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * gJKJLNLIEII.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(gJKJLNLIEII);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * dEKPBIGFNBE.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(dEKPBIGFNBE);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetMultiPathAvatarInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // gJKJLNLIEII [packed=true]
            input.readPackedUInt32(gJKJLNLIEII, tag);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // dEKPBIGFNBE
            tag = input.readRepeatedMessage(dEKPBIGFNBE, tag);
            bitField0_ |= 0x00000004;
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
          case 120: {
            // gJKJLNLIEII [packed=false]
            tag = input.readRepeatedUInt32(gJKJLNLIEII, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.gJKJLNLIEII, gJKJLNLIEII);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.dEKPBIGFNBE, dEKPBIGFNBE);
      }
      output.endObject();
    }

    @Override
    public GetMultiPathAvatarInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1651469948: {
            if (input.isAtField(FieldNames.gJKJLNLIEII)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(gJKJLNLIEII);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1860965253: {
            if (input.isAtField(FieldNames.dEKPBIGFNBE)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(dEKPBIGFNBE);
                bitField0_ |= 0x00000004;
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
    public GetMultiPathAvatarInfoScRsp clone() {
      return new GetMultiPathAvatarInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetMultiPathAvatarInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetMultiPathAvatarInfoScRsp(), data).checkInitialized();
    }

    public static GetMultiPathAvatarInfoScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetMultiPathAvatarInfoScRsp(), input).checkInitialized();
    }

    public static GetMultiPathAvatarInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMultiPathAvatarInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetMultiPathAvatarInfoScRsp messages
     */
    public static MessageFactory<GetMultiPathAvatarInfoScRsp> getFactory() {
      return GetMultiPathAvatarInfoScRspFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code DEKPBIGFNBEEntry}
     */
    public static final class DEKPBIGFNBEEntry extends ProtoMessage<DEKPBIGFNBEEntry> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional uint32 key = 1;</code>
       */
      private int key;

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       */
      private int value_;

      private DEKPBIGFNBEEntry() {
      }

      /**
       * @return a new empty instance of {@code DEKPBIGFNBEEntry}
       */
      public static DEKPBIGFNBEEntry newInstance() {
        return new DEKPBIGFNBEEntry();
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return whether the key field is set
       */
      public boolean hasKey() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return this
       */
      public DEKPBIGFNBEEntry clearKey() {
        bitField0_ &= ~0x00000001;
        key = 0;
        return this;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return the key
       */
      public int getKey() {
        return key;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public DEKPBIGFNBEEntry setKey(final int value) {
        bitField0_ |= 0x00000001;
        key = value;
        return this;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @return whether the value_ field is set
       */
      public boolean hasValue() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @return this
       */
      public DEKPBIGFNBEEntry clearValue() {
        bitField0_ &= ~0x00000002;
        value_ = 0;
        return this;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @return the value_
       */
      public MultiPathAvatarTypeOuterClass.MultiPathAvatarType getValue() {
        return MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(value_);
      }

      /**
       * Gets the value of the internal enum store. The result is
       * equivalent to {@link DEKPBIGFNBEEntry#getValue()}.getNumber().
       *
       * @return numeric wire representation
       */
      public int getValueValue() {
        return value_;
      }

      /**
       * Sets the value of the internal enum store. This does not
       * do any validity checks, so be sure to use appropriate value
       * constants from {@link MultiPathAvatarTypeOuterClass.MultiPathAvatarType}. Setting an invalid value
       * can cause {@link DEKPBIGFNBEEntry#getValue()} to return null
       *
       * @param value the numeric wire value to set
       * @return this
       */
      public DEKPBIGFNBEEntry setValueValue(final int value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        return this;
      }

      /**
       * <code>optional .MultiPathAvatarType value = 2;</code>
       * @param value the value_ to set
       * @return this
       */
      public DEKPBIGFNBEEntry setValue(
          final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value) {
        bitField0_ |= 0x00000002;
        value_ = value.getNumber();
        return this;
      }

      @Override
      public DEKPBIGFNBEEntry copyFrom(final DEKPBIGFNBEEntry other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          key = other.key;
          value_ = other.value_;
        }
        return this;
      }

      @Override
      public DEKPBIGFNBEEntry mergeFrom(final DEKPBIGFNBEEntry other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasKey()) {
          setKey(other.key);
        }
        if (other.hasValue()) {
          setValueValue(other.value_);
        }
        return this;
      }

      @Override
      public DEKPBIGFNBEEntry clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        key = 0;
        value_ = 0;
        return this;
      }

      @Override
      public DEKPBIGFNBEEntry clearQuick() {
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
        if (!(o instanceof DEKPBIGFNBEEntry)) {
          return false;
        }
        DEKPBIGFNBEEntry other = (DEKPBIGFNBEEntry) o;
        return bitField0_ == other.bitField0_
          && (!hasKey() || key == other.key)
          && (!hasValue() || value_ == other.value_);
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 16);
          output.writeEnumNoTag(value_);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeEnumSizeNoTag(value_);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public DEKPBIGFNBEEntry mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // key
              key = input.readUInt32();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 16) {
                break;
              }
            }
            case 16: {
              // value_
              final int value = input.readInt32();
              if (MultiPathAvatarTypeOuterClass.MultiPathAvatarType.forNumber(value) != null) {
                value_ = value;
                bitField0_ |= 0x00000002;
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
          output.writeUInt32(FieldNames.key, key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeEnum(FieldNames.value_, value_, MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
        }
        output.endObject();
      }

      @Override
      public DEKPBIGFNBEEntry mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 106079: {
              if (input.isAtField(FieldNames.key)) {
                if (!input.trySkipNullValue()) {
                  key = input.readUInt32();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 111972721: {
              if (input.isAtField(FieldNames.value_)) {
                if (!input.trySkipNullValue()) {
                  final MultiPathAvatarTypeOuterClass.MultiPathAvatarType value = input.readEnum(MultiPathAvatarTypeOuterClass.MultiPathAvatarType.converter());
                  if (value != null) {
                    value_ = value.getNumber();
                    bitField0_ |= 0x00000002;
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
      public DEKPBIGFNBEEntry clone() {
        return new DEKPBIGFNBEEntry().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static DEKPBIGFNBEEntry parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new DEKPBIGFNBEEntry(), data).checkInitialized();
      }

      public static DEKPBIGFNBEEntry parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new DEKPBIGFNBEEntry(), input).checkInitialized();
      }

      public static DEKPBIGFNBEEntry parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new DEKPBIGFNBEEntry(), input).checkInitialized();
      }

      /**
       * @return factory for creating DEKPBIGFNBEEntry messages
       */
      public static MessageFactory<DEKPBIGFNBEEntry> getFactory() {
        return DEKPBIGFNBEEntryFactory.INSTANCE;
      }

      private enum DEKPBIGFNBEEntryFactory implements MessageFactory<DEKPBIGFNBEEntry> {
        INSTANCE;

        @Override
        public DEKPBIGFNBEEntry create() {
          return DEKPBIGFNBEEntry.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName key = FieldName.forField("key");

        static final FieldName value_ = FieldName.forField("value");
      }
    }

    private enum GetMultiPathAvatarInfoScRspFactory implements MessageFactory<GetMultiPathAvatarInfoScRsp> {
      INSTANCE;

      @Override
      public GetMultiPathAvatarInfoScRsp create() {
        return GetMultiPathAvatarInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName gJKJLNLIEII = FieldName.forField("GJKJLNLIEII");

      static final FieldName dEKPBIGFNBE = FieldName.forField("DEKPBIGFNBE");
    }
  }
}
