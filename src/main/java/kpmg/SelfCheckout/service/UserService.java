package kpmg.SelfCheckout.service;

import kpmg.SelfCheckout.dto.FeedbackRequest;
import kpmg.SelfCheckout.dto.RegisterRequest;
import kpmg.SelfCheckout.model.User;
import kpmg.SelfCheckout.repository.UserRepository;
import kpmg.SelfCheckout.security.EncryptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public User getUserByMobileNumber(String mobileNumber) throws Exception {
        return userRepository.findByEncryptedMobile(EncryptionUtils.encrypt(mobileNumber));
    }

    public User registerUser(RegisterRequest registerRequest) throws Exception {
        User user = new User();
        user.setName(registerRequest.getName());
        user.setEncryptedMobile(EncryptionUtils.encrypt(registerRequest.getMobileNumber()));
        user.setLoyaltyPoints(0);
        user.setFeedbackAvg(0.0);
        user.setRole("CUSTOMER");
        return userRepository.save(user);
    }

    public void updateFeedbackAvg(FeedbackRequest feedbackRequest) {
        Optional<User> user = userRepository.findById(feedbackRequest.getUserId());
        Double oldFeedbackRating = user.get().getFeedbackAvg();

        // Calculate the new feedback rating
        Double updatedFeedbackRating = (oldFeedbackRating + feedbackRequest.getRating()) / 2;

        // Add 10 loyalty points for every feedback
        user.get().setLoyaltyPoints(user.get().getLoyaltyPoints() + 10);

        user.get().setFeedbackAvg(updatedFeedbackRating);
        userRepository.save(user.get());
    }
}
