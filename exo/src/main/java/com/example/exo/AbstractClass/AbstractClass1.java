package com.example.exo.AbstractClass;

import com.example.exo.ConcreteDependance.ConcreteDependance1;
import com.example.exo.ConcreteDependance.ConcreteDependance2;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public abstract class AbstractClass1 {
  public ConcreteDependance1 concreteClass1;
  public ConcreteDependance2 concreteClass2;
}
