package com.example.arjun.service;


import java.util.List;

import com.example.arjun.entity.Payment;
import com.example.arjun.exception.PaymentNotFoundException;


public interface IPaymentService {
	public Payment addPayment(Payment payment);
	public Payment updatePayment(Payment payment)throws PaymentNotFoundException;
	public boolean deletePaymentById(Integer paymentId);
	public List<Payment> getAllPaymentDetails();
	Payment removePayment(long id) throws PaymentNotFoundException;
	Payment getPaymentById(Integer paymentId) throws PaymentNotFoundException;


}
	
	
