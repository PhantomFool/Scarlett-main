// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Climber;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.CANrange;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.utils.SubsystemABS;

public class Climber extends SubsystemABS {
  /** Creates a new Climber. */
  private TalonFX Climoter13 = new TalonFX(13);
  private TalonFX Climoter15 = new TalonFX(15);
  private Timer timer = new Timer();
  private CANrange measure = new CANrange(17);
  public double rangePosition = 0;
  ShuffleboardTab tab = Shuffleboard.getTab("CANrange Status");
  public Climber() {
    Climoter15.setControl(new Follower(Climoter13.getDeviceID(), false));
    
  }

  @Override
  public void periodic() {
    if (rangePosition == 0){
       GoUpDash(1);
       tab.add("Elevator Position", rangePosition);
    }
    
  }

  public void GoUpDash(int sec){
    timer.reset();  
    timer.start();  

    Climoter13.set(0.5);  

    if (timer.get() >= sec) { 
      Climoter13.set(0);  
      timer.stop(); 
    }

    rangePosition = measure.getDistance().getValueAsDouble();

  }

  public void GoDownDash(int sec){
    timer.reset();  
    timer.start();  

    Climoter13.set(-0.5);


    if (timer.get() >= sec) { 
      Climoter13.set(0);  
      timer.stop(); 
    }

    rangePosition = measure.getDistance().getValueAsDouble();

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
    return Climoter13.getDeviceTemp().getValueAsDouble() > 60;
  }

  @Override
  public void Failsafe() {

  }
}
