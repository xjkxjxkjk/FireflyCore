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

public final class NewMapRotOuterClass {
  /**
   * <pre>
   *  Ijjhkdnfkmd
   * </pre>
   *
   * Protobuf type {@code NewMapRot}
   */
  public static final class NewMapRot extends ProtoMessage<NewMapRot> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  gnhjbgfembm
     * </pre>
     *
     * <code>optional .Vector4 vector4 = 8;</code>
     */
    private final Vector4OuterClass.Vector4 vector4 = Vector4OuterClass.Vector4.newInstance();

    /**
     * <pre>
     *  ggjlnhghdeg
     * </pre>
     *
     * <code>optional .Vector vector3 = 15;</code>
     */
    private final VectorOuterClass.Vector vector3 = VectorOuterClass.Vector.newInstance();

    private NewMapRot() {
    }

    /**
     * <pre>
     *  Ijjhkdnfkmd
     * </pre>
     *
     * @return a new empty instance of {@code NewMapRot}
     */
    public static NewMapRot newInstance() {
      return new NewMapRot();
    }

    /**
     * <pre>
     *  gnhjbgfembm
     * </pre>
     *
     * <code>optional .Vector4 vector4 = 8;</code>
     * @return whether the vector4 field is set
     */
    public boolean hasVector4() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  gnhjbgfembm
     * </pre>
     *
     * <code>optional .Vector4 vector4 = 8;</code>
     * @return this
     */
    public NewMapRot clearVector4() {
      bitField0_ &= ~0x00000001;
      vector4.clear();
      return this;
    }

    /**
     * <pre>
     *  gnhjbgfembm
     * </pre>
     *
     * <code>optional .Vector4 vector4 = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableVector4()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public Vector4OuterClass.Vector4 getVector4() {
      return vector4;
    }

    /**
     * <pre>
     *  gnhjbgfembm
     * </pre>
     *
     * <code>optional .Vector4 vector4 = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public Vector4OuterClass.Vector4 getMutableVector4() {
      bitField0_ |= 0x00000001;
      return vector4;
    }

    /**
     * <pre>
     *  gnhjbgfembm
     * </pre>
     *
     * <code>optional .Vector4 vector4 = 8;</code>
     * @param value the vector4 to set
     * @return this
     */
    public NewMapRot setVector4(final Vector4OuterClass.Vector4 value) {
      bitField0_ |= 0x00000001;
      vector4.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     *  ggjlnhghdeg
     * </pre>
     *
     * <code>optional .Vector vector3 = 15;</code>
     * @return whether the vector3 field is set
     */
    public boolean hasVector3() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  ggjlnhghdeg
     * </pre>
     *
     * <code>optional .Vector vector3 = 15;</code>
     * @return this
     */
    public NewMapRot clearVector3() {
      bitField0_ &= ~0x00000002;
      vector3.clear();
      return this;
    }

    /**
     * <pre>
     *  ggjlnhghdeg
     * </pre>
     *
     * <code>optional .Vector vector3 = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableVector3()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public VectorOuterClass.Vector getVector3() {
      return vector3;
    }

    /**
     * <pre>
     *  ggjlnhghdeg
     * </pre>
     *
     * <code>optional .Vector vector3 = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public VectorOuterClass.Vector getMutableVector3() {
      bitField0_ |= 0x00000002;
      return vector3;
    }

    /**
     * <pre>
     *  ggjlnhghdeg
     * </pre>
     *
     * <code>optional .Vector vector3 = 15;</code>
     * @param value the vector3 to set
     * @return this
     */
    public NewMapRot setVector3(final VectorOuterClass.Vector value) {
      bitField0_ |= 0x00000002;
      vector3.copyFrom(value);
      return this;
    }

    @Override
    public NewMapRot copyFrom(final NewMapRot other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        vector4.copyFrom(other.vector4);
        vector3.copyFrom(other.vector3);
      }
      return this;
    }

    @Override
    public NewMapRot mergeFrom(final NewMapRot other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasVector4()) {
        getMutableVector4().mergeFrom(other.vector4);
      }
      if (other.hasVector3()) {
        getMutableVector3().mergeFrom(other.vector3);
      }
      return this;
    }

    @Override
    public NewMapRot clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      vector4.clear();
      vector3.clear();
      return this;
    }

    @Override
    public NewMapRot clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      vector4.clearQuick();
      vector3.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof NewMapRot)) {
        return false;
      }
      NewMapRot other = (NewMapRot) o;
      return bitField0_ == other.bitField0_
        && (!hasVector4() || vector4.equals(other.vector4))
        && (!hasVector3() || vector3.equals(other.vector3));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(vector4);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 122);
        output.writeMessageNoTag(vector3);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(vector4);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(vector3);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public NewMapRot mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 66: {
            // vector4
            input.readMessage(vector4);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // vector3
            input.readMessage(vector3);
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
        output.writeMessage(FieldNames.vector4, vector4);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.vector3, vector3);
      }
      output.endObject();
    }

    @Override
    public NewMapRot mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 337790801: {
            if (input.isAtField(FieldNames.vector4)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(vector4);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 337790800: {
            if (input.isAtField(FieldNames.vector3)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(vector3);
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
    public NewMapRot clone() {
      return new NewMapRot().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static NewMapRot parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new NewMapRot(), data).checkInitialized();
    }

    public static NewMapRot parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NewMapRot(), input).checkInitialized();
    }

    public static NewMapRot parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NewMapRot(), input).checkInitialized();
    }

    /**
     * @return factory for creating NewMapRot messages
     */
    public static MessageFactory<NewMapRot> getFactory() {
      return NewMapRotFactory.INSTANCE;
    }

    private enum NewMapRotFactory implements MessageFactory<NewMapRot> {
      INSTANCE;

      @Override
      public NewMapRot create() {
        return NewMapRot.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName vector4 = FieldName.forField("vector4");

      static final FieldName vector3 = FieldName.forField("vector3");
    }
  }
}
