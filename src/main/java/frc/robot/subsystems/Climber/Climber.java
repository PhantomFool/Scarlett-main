// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Climber;

import com.ctre.phoenix6.controls.ControlRequest;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.CANrange;
import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkBase.ControlType;

import frc.robot.utils.SubsystemABS;

public class Climber extends SubsystemABS {
  /** Creates a new Climber. */
  private TalonFX Climoter13 = new TalonFX(13);
  private TalonFX Climoter15 = new TalonFX(15);
  private CANrange Timer = new CANrange(17);
  public Climber() {
    
    
    
  }

  @Override
  public void periodic() {
    
    
  }

  public void GoUpDash(){
    
  }

  @Override
  public void init() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'init'");
  }

  @Override
  public void simulationPeriodic() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'simulationPeriodic'");
  }

  @Override
  public void setDefaultCmd() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setDefaultCmd'");
  }

  @Override
  public boolean isHealthy() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isHealthy'");
  }

  @Override
  public void Failsafe() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Failsafe'");
  }
}
