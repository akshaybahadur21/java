/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.data;

import java.util.List;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.Operands;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.tools.Shape;
import org.tensorflow.types.TBool;
import org.tensorflow.types.TInt64;
import org.tensorflow.types.TString;

/**
 */
public final class ExperimentalCsvDataset extends PrimitiveOp implements Operand<Object> {
  
  /**
   * Factory method to create a class wrapping a new ExperimentalCsvDataset operation.
   * 
   * @param scope current scope
   * @param filenames 
   * @param compressionType 
   * @param bufferSize 
   * @param header 
   * @param fieldDelim 
   * @param useQuoteDelim 
   * @param naValue 
   * @param selectCols 
   * @param recordDefaults 
   * @param outputShapes 
   * @return a new instance of ExperimentalCsvDataset
   */
  public static ExperimentalCsvDataset create(Scope scope, Operand<TString> filenames, Operand<TString> compressionType, Operand<TInt64> bufferSize, Operand<TBool> header, Operand<TString> fieldDelim, Operand<TBool> useQuoteDelim, Operand<TString> naValue, Operand<TInt64> selectCols, Iterable<Operand<?>> recordDefaults, List<Shape> outputShapes) {
    OperationBuilder opBuilder = scope.env().opBuilder("ExperimentalCSVDataset", scope.makeOpName("ExperimentalCsvDataset"));
    opBuilder.addInput(filenames.asOutput());
    opBuilder.addInput(compressionType.asOutput());
    opBuilder.addInput(bufferSize.asOutput());
    opBuilder.addInput(header.asOutput());
    opBuilder.addInput(fieldDelim.asOutput());
    opBuilder.addInput(useQuoteDelim.asOutput());
    opBuilder.addInput(naValue.asOutput());
    opBuilder.addInput(selectCols.asOutput());
    opBuilder.addInputList(Operands.asOutputs(recordDefaults));
    opBuilder = scope.applyControlDependencies(opBuilder);
    Shape[] outputShapesArray = new Shape[outputShapes.size()];
    for (int i = 0; i < outputShapesArray.length; ++i) {
      outputShapesArray[i] = outputShapes.get(i);
    }
    opBuilder.setAttr("output_shapes", outputShapesArray);
    return new ExperimentalCsvDataset(opBuilder.build());
  }
  
  /**
   */
  public Output<?> handle() {
    return handle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<Object> asOutput() {
    return (Output<Object>) handle;
  }
  
  private Output<?> handle;
  
  private ExperimentalCsvDataset(Operation operation) {
    super(operation);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }
}