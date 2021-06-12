package com.example.Namigation.FragTabLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.Namigation.R;

public class FragTorner extends Fragment {
    private View view;
    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9, cardView10;


    public static FragTorner newinstance() {
        FragTorner fragTorner = new FragTorner();
        return fragTorner;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.frag_torner, container, false);

        cardView1 = (CardView) view.findViewById(R.id.CV1);
        cardView2 = (CardView) view.findViewById(R.id.CV2);
        cardView3 = (CardView) view.findViewById(R.id.CV3);
        cardView4 = (CardView) view.findViewById(R.id.CV4);
        cardView5 = (CardView) view.findViewById(R.id.CV5);
        cardView6 = (CardView) view.findViewById(R.id.CV6);
        cardView7 = (CardView) view.findViewById(R.id.CV7);
        cardView8 = (CardView) view.findViewById(R.id.CV8);
        cardView9 = (CardView) view.findViewById(R.id.CV9);
        cardView10 = (CardView) view.findViewById(R.id.CV10);

        final Intent intent = new Intent(Intent.ACTION_VIEW);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://adcr.naver.com/adcr?x=I8sF1UvZhaJ+GKXn07NUqv///w==kbiWv3v8BTx/ZbFIvMZB80FJjtqjwmZWrHLLzlHFBD3Z6h8Rz+cZuworBd5quoG6Gh1v0LHPyVZfJrewOMecc5vwkwPla/MyamR5H3Y/8Nvy6Kb0sk9Xy2LIl/IoPtisEAkCbCKoAEYaX2gCxi70rqPArr7p5NRPFtXU4JYgKJ/eIe8J42/aCG3vUCPjFm3X0jDWiOW+VNHDERWMjwCR8Jr1e5TlFytag+U5HSX8W3/AoMZIwmeyhwWXsGrLxulOenHn3vvB+c1rWSc3E/l7CE0+BRoF10KTSOR4K0NNa/NaR2kU7wqERvtXsAms+2RUzYHyNW2qP/jN4wbCp5I+b+hdt1lCvGnfzwbuhsPnNSUXXT/epLhd02iOdBSS7WNS4Xu4xEORI8agcqU1+ChFmadPWaqDVDrrGJbAremqYsxS9+cUEplBSNZ5uDhdmgceFhFHb0x0yNH7VSNR2zGBt/R77MDaYLVPyIPoqk3UHylL3qRV2voY6s1awy74dNLK/ejMoGDNSJG+6q+Tcam/FfappPdnpQg+UHByA0Afb0dmYNVPIpwPaPY+BiHbj3UyoZ7heEzDsaE+N6oQpTu9oHRzyX6CUzmwxunufPP3sFsgfNCjTzou00A2fqDt73+mBkg+guIGWFM/oHWphiqrVQAqY5TYGbGPZqLcu8DaxtuA8PDh8S78N8OFj0Amiq4M2U7W0mCYUuzrZu74W8FoaTgy1y0nXJ2HTnJjEyzCk1qmyMWPK3evGrlLnXFRqsVBHLa9YLwSKg+gQb8j4YPgs5z6JWOyO/Z84TZ1u5oNRa+ovkVLAC/Re9cv0xFo33gTPLgDHFNVo3s0x9yh6pkYQHRwh6wxVGKUB1n4jMPNRr6G7uE0Q/HlYMaiVeY5Saqich4h7mmyVOH5vTSJTF7YSdZRfMwE9oGJNgesnOXsiADhbfeLa9MoO1ygct81vYLdRRV8snkFV6WFvMF+7Rjgv4w=="));
                startActivity(intent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://adcr.naver.com/adcr?x=gAa48Gl0CrbMMBngUCU2rv///w==kEH3yYGY6/CRAOuh1tLqyvwtP/s34cwv3NuVQVOhE8rOwh/olsQPuMTV33ge/0SKpF146iJao+EEwbbiLJdDei3xKX5xYRisGOWUGpKyUdDc1O4fx70c+48/mzyWo94ho933ZN+cz9/q56ChjhNgsN/lVvxeTYvF89R5FN3VnFLbzg2bMS44vJ+K5193fme1rOgnyiZ0nR6sF3b9GuVklMh44ZBSvu7Qz7aJv8DeyqXT6WT2lx1X2qqTgocEDeXsmUeWvrDDPdIZs8HVmGXdgWhxqAtXcxR05J9GsFK6ZPI33S8gH0UcAr+6c6ve3aQxlC+8B+V9LZV4VLMKBcFu85aE1Ar67XOpr/CGgFPNhU4rgwqGZSbDT2bywE83dt1nJJFN5Qmb9L+Ga/hi/726sNRRDyefGQaEV1ZBWdKlgHIG8ZX/NQOx4vhX4AC8pBK01Oun1+M7kaZdUEPF6NUkmnyfEZrYpe+3zS925C+sIWvCnMcmxwdFo8Fo4z0ba/w3r5jVJ2t6UrwLr2VtRP7HsjwieK9estJhCE2zToGVUsZVAMOie24vKX2rw5nIwA3HxxKmyVhlO6K6Pqc6lawNl+S3sKa+sdu3Y9wHbsVyj4A6JyND4XOq0y7V2nut1EALPGCfN7bDYFHdmdjcHa9HwHPTepCN4GZRqlwTdqMKMGL6SjAirRW4GQdg9xojjI+50Q00/0obi773XYWi2/XM4+dF/xvWX+T/WiLybmz1CyahoFRJVzoJt0w/6YVVz4S4K2Dxy2ml0qAgaBnWc9r9K/DMgRvorLSBdSsjJZSQhXu8vgyA29+l4cY/D+4gXa0GE9U0UaoQPrcix5ELo+LQ68GA+XwVAalXbTiHhxWECclioKQUIMQMnvMKb6pm1DMEaav6xz9hsi3PL2e2Qzxe9QMtu+NzVi7murn13NNy4GrSQoyOdPFc6URp4+2sRT+jcAP6p2xYzbpXdVyOtHw6G/Q6pzF7gDVaBkyrqAWivG7/9lW7Eerr7xbV955PSReHj"));
                startActivity(intent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://adcr.naver.com/adcr?x=ht/N2bAC7qaria6D0m8L+P///w==k4nqen1QuGzwq1LiNZbMic4hJ7NFYOOGj8PRIdwmA25XbdPLbt4UYxw/sE4iJ+jezOG4BNr6mFlX2Iss5DfT/O4zkwMG+9bQ0clpxNJYFJpWuASOXyeNQCt9cONUvJzFO1QjiRf8sUY4lbbM198vLrJbj5qz8wJMf3z+cklJAq8we85HyKhiK0NsvI/jfMO+VAz3F773w5gMj/A0bz+N4qn+hTYsoK2Y6X/fndBpCIVm92yXF2dzn+8CoW4NMzK4vtjmxhO8dN+DywBmDp1Xsp5ITkJnCTEuyzPHk79TMXugwXXopdBsG9PgTJP2VZDIiRP/H3kpNC9QKWt4AjzDCGRnMND33vaEjTGWld1q0st3c8TMl4yHUgVzu5FehAbANs8omn0yYnDAKDuMoFFvRz/Uux3HWwmkv1ZY+zleMN87qWjpDm2eA7e4TjfkYYqvrGdDJNKynzEIDI0dB7LETeedmQwODVZ1/qwIxJS2rLwtYk6Kj3fOK6hilEBh/VKqHs+s014QN68CwzWUh9q5qTtaqoelMFVrBN/383vVMuXcRnFkRuWZkCuHOqmQ/wqB/YmG58xvTHFUOKxzsX48+n4iJcvdhamjFsFiK9Th3SO1tjG19l35CU4HYJNmlpEnT4IupGj3Yt4L6XhUM73f37dA/nt8T+qLVtyjS9GnMMwfxkwWpLGP0YeSvaz8ifjOQrca82UbddprBaOprcUZsTEJZcmMlo9gdc4uNNtp9gKSgtVrpLlJoGg7njMD6av+y6vJ+FkPPhAWrZ/vBmcyvhvCdHv+PUYUvxxIFlEGgt/0kkhYYXLUT8vZaLRr/6jpgpXLASpvi35Eh+LXlztwT5shZ8tZOy5EyJt6sPnjmlFd5b+Le9TA2bOaM6vzbZaK8Yf72gqz07WWZLmV3gatJe7VHe9ztipRsPXLWV0lysyO+BAzyGgDbE2Rjv4A4QBXykyb2gvBu+vgbqIizylYBb/VPgEjKUhjwhefAIqae+NGRIMdeKXFFxf2NjEY+jN8s"));
                startActivity(intent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=cdBu8%2B5GvrioW4wsaYU8gv%2F%2F%2Fw%3D%3DsnS2C7meeXlnTmZSS7B8ijk%2BbBQL2sbWL1M2Smh5HY8no9h%2BuAefyj6SM1pmhfLsGWfhsg6kgF5MuKClb69AK4w%2FhggqGonpq03kjyWnPyGVVXemfpmeX70wC2wQT5nyiBte2Da%2BcRSMmzTx7XU%2B5wCjRGjCM%2F76iF3GZtX5MjX%2FK20fKiUVVzcp6eLUKj621YuvYv8w34cR35Vq%2BS%2BkYPbuVw3GdaDAvxDSjC3cnt2Z%2F22ms%2BW8TiQQNz%2FOHMMFFMYqBqFnCG%2BUmgIsAMOxZMjkh3kd12PuLuvi2hYtAQBgDmKOpNTqOdE1FOH6RRWwCB7P9jx5KZr1oy9qstZx7m%2F1h2BNvXNnwZA90M08Ngd507wpXAsdtAdcixKlH483RaXEPSTSJxSd4DjaxOs7a3GzGfPSE2dUJc6rv3D9ayUB4Lty8PpdwCK86dYftJT8kB%2BKmYEF7rRHR9utgre0UrIZTJiUTD3zTlAocev9mWtWf9gSUUYK9X8fRebK3tqvVA7Tox66DfKvN51npZkBXlvmaeZZStgMb0Nz%2F2mqwGhPIpcxo3hVwvGZli4dJohTy7r7PpTb8QWGJ%2Ban6WvERz%2B4Rz2rgmR1%2BxF%2B4d%2BrA%2FfhUPZD9SoizFJSF9HfQlWzuox4dB0YqA5pJucg1fK4QdmFfXYmGxEZ556uRjjw%2Be8v7A1z228jrV9AJJOS%2BBt78D%2B1GzYyCQAVsDO6ulMSblrsBuXUjifF2k1noRMD0yl4lAqK5wWzoY%2FSoXjEAc9EKjjUENfGIwB1JAiSNGr7FjYKoDr6us%2BRKRCOTdsWr9TI%3D&nvMid=82120298242&catId=50000303"));
                startActivity(intent);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=s31HGvPFK4DPmi1lgUzg4f%2F%2F%2Fw%3D%3DsCV7242bd2qxCpHy2zhYFrjZWHzjT25ijJYlC782KmPG6XWvO2U%2FrDoyMuH4gvGC1HPJD7rlXYsOAopJqungdoGedW%2BMyCIcyNsWGbi%2FX%2FUA%2Fa18qhDQ1A%2FKJp3fgBDorBK023F3aT4U41jUa9J1Au67jWoEpIqIacPlqEJ8IX6gxp6mPjMUPt4VN9Y93ECKykwxbhjx2w3BkNYTNeU3Yv2FEV98CfAwi%2FgpsOD1fQ6A0j0aEEtcTj6B%2BbIHtoZe1dpqhOrFk1svKcAYLiPGU%2Fhz1O1%2FiPlHfZMPkqfHG49Lffisv5tHfoGFh7RH%2BtSaOAFJNLWxG%2Fj2gEfGb7GroeFtEKzXydI9bC%2BjxvjJuDxDVFElWRXtUMK%2FH4bCOyw7hXDWTeRReOiaoO3w1jY%2BQmspRS8DTeJ0JNdqys6VoLy4ZoPjQLdxIhZGPf1uJSfJHBFH6zBJn2Cw2Nn9osSZjocleObKWC3DRgu4dufAn%2BYCASdehT75qYJ2tUMvD64PZthLck6ip5Fd5KswCIELSb9sI6j9kGR0t1zTwW%2B4tv5DLcEuKiIcOUZ6APO4HchkI6sHZxDNX7WrtiZ2b22SKPIFG6bmN%2Bb4nAKN8huHbdI9NjpGFqPI1sMG%2FwLpkzCV2iaqjNX0O30sGh9EUh1wZ83moMDkt0a%2B2iF7ElzcrVUKDrgClekVxtSLNN1yS74gXjf337Kh3Hio8LJAMH5H6tSS9PRd7rxYYHqLykyKaWiYFUTRXdql8AT6ZvJM3Fv2Ay1Vhq%2FH77x9Zlr1IFzyuow%3D%3D&nvMid=8774090162&catId=50000303"));
                startActivity(intent);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=aK8Q%2BmbBEyilZYITTB7Mi%2F%2F%2F%2Fw%3D%3Ds8UsUReZe0JSQi3RjDVFXZeHQtXVBV%2BzlBlkGYA2kRPbo9h%2BuAefyj6SM1pmhfLsG0cdjw4mSvcldKcGQxisDZZba3h9nl14OCY030vlHFOhVXemfpmeX70wC2wQT5nyiBte2Da%2BcRSMmzTx7XU%2B5wCjRGjCM%2F76iF3GZtX5MjX%2FK20fKiUVVzcp6eLUKj621YuvYv8w34cR35Vq%2BS%2BkYPbuVw3GdaDAvxDSjC3cnt2Z%2F22ms%2BW8TiQQNz%2FOHMMFFaxG1xmQaU15Z2xDHM3r%2FHTkh3kd12PuLuvi2hYtAQBgDmKOpNTqOdE1FOH6RRWwCB7P9jx5KZr1oy9qstZx7m%2F1h2BNvXNnwZA90M08Ngd6xIPk8Q7bXlT6EwSOyLFPNknnpBql96m6NvKPxU4%2F6XCInXM8RDK8520cJbUD184W7LjCM3pwWDcZiAq7i8301B%2BKmYEF7rRHR9utgre0UrLWFQM5aOQMfjWSB751B1noK9zbWSWfS%2BvRuHPhnTnE8vT9ZwAKFE%2Bq5lXr5U%2BjF6WdA2%2FMuafb%2BnANrt8FC5IbhYS8zKd4fQftLBMGwqfN2OUEOF5YOlbEccskxu32ETObvKJE3ieELs1OJxo%2Fftuo7N12WhMWDxWDv72%2FWgNtOLZEi5r9Z1GXQh4zucjs4GMbGnaDGtTEArH3odxgksTiraPI2ShZDqE%2BrxnjvpoVLa48HxRqhN%2FwCAVGLJ%2BcL02wQHUZbhfXVelE6K4cAXUTNjqh%2FZemCCOboDhnweAmG&nvMid=82752615670&catId=50000303"));
                startActivity(intent);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=oy8%2BNNyufSeP191mcZHvOP%2F%2F%2Fw%3D%3DsyWazVox71aeyE8%2BA04DmfQf2qEy0M2SvKlXyjxcE9sHo9h%2BuAefyj6SM1pmhfLsGRj37rtMAY7OgsRvmIB5mfEnaVAwMeC8rhh4iU68IJpZVXemfpmeX70wC2wQT5nyiBte2Da%2BcRSMmzTx7XU%2B5wCjRGjCM%2F76iF3GZtX5MjX%2FK20fKiUVVzcp6eLUKj621YuvYv8w34cR35Vq%2BS%2BkYPbuVw3GdaDAvxDSjC3cnt2Z%2F22ms%2BW8TiQQNz%2FOHMMFFklLU8oyoCJ1ZYzoVFn%2FtUzkh3kd12PuLuvi2hYtAQBgDmKOpNTqOdE1FOH6RRWwCB7P9jx5KZr1oy9qstZx7m3qdLaId4ClBqiGk67uT5vI6AQL4xsn1hRSYVK%2BZyP2pknnpBql96m6NvKPxU4%2F6XDsGcHQRfqVYNU51Detf2vT4pEClRhpz%2B3zQlY4nO1dDB%2BKmYEF7rRHR9utgre0UrJDb2Jk6el5k36MZFHw9GSkowNaetUEFyR7V3xyI4XEEJX%2BeHDGMevHVnV52MC6jg1vPw1C3Xru8wQk5YpIuGnC93L0LmIhbzkwyKlhtqZwfAmplzJTOxzPEruhwJ4sFSC3Vx90sh6LL7Kg8k6CTlNtaSABahphKfjZh2Z6oFesFOAYPLb0khlVkFHhnxEdSJW5D7cXCznLQHnERv5jyfixQf%2Fp3Pda3xFt0rTMotv9vxyAhEKTy%2B0Zvtn8oYxIR0Q%3D%3D&nvMid=81284440767&catId=50000304"));
                startActivity(intent);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=EksdTBY56N%2BkC51NJvmEOf%2F%2F%2Fw%3D%3DsEXhDmjtA0t42o1bHMd%2Fsso3GJdoD1F7tECjqj2Yh8MTo9h%2BuAefyj6SM1pmhfLsGJkdclxEtmFXh2OWUtMG4nejjpgbMDK5QqSv28R6u0AlVXemfpmeX70wC2wQT5nyiBte2Da%2BcRSMmzTx7XU%2B5wCjRGjCM%2F76iF3GZtX5MjX%2FK20fKiUVVzcp6eLUKj621YuvYv8w34cR35Vq%2BS%2BkYPbuVw3GdaDAvxDSjC3cnt2Z%2F22ms%2BW8TiQQNz%2FOHMMFFqm%2BRN7WsYRY0p%2FKEzuV7Vzkh3kd12PuLuvi2hYtAQBgDmKOpNTqOdE1FOH6RRWwCB7P9jx5KZr1oy9qstZx7m32z6wxul0x%2F0EWxD7TAIpR8O1uZtwUCD5GB%2Fc6dX07xknnpBql96m6NvKPxU4%2F6XLGKIKVKz1HfRyENG9T6Effxy8iRZl3b7jLwE88B%2FdRVB%2BKmYEF7rRHR9utgre0UrCXAJsWiltFXCakyqQScpiCZpyixCcZ1nwcyVqShNiJ7zL70DmyB9ppAiQE4Nh%2F%2FFh2HNUOQMlvJ847C2FmUe4ieFQ1zAzaISVbeQlhZQDlysCHqnqrH9l%2BeCetVhrGk8xNO%2Bd3zDatSFBQL0brny686bFWDbl%2F5tdfiPSc1nZUBTIETHLNys2o0jgmxqRUJqJPI8KjgCR9y%2B0PQYA4NWj8%2FJLZ2PAky8ZL0jwSVEuiUgQqGimkmlGi1WN2oD8u4FEHQIiXcF4qwUXZ2sX76wW8%3D&nvMid=81034965410&catId=50000304"));
                startActivity(intent);
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=mevqb1t7HWjB%2FI3mzeEAoP%2F%2F%2Fw%3D%3Ds%2BqsxsDe1k9RK7hU3mLXtqSFPINuACK%2Fh5XUB6pkgmcy6XWvO2U%2FrDoyMuH4gvGC1Ggbzp8LqV%2BfPLwmpzmiuah4pza8ebIOIXPrPsGGS95ek6v2w9jBqMGR4TTsgYaQnqO7llcvdB5pXUYBj3J9tTTn1jcDteldyp%2FSUtpO0WAu5v2gOzDoVHla%2Fm5r19pslZTE%2BtmeeMFelFhJLjUrn0ua0O2TX7GIDZW3de8vjU8wDRg%2FhSzyfV%2B1RbWOSZD05ffNT45PJiZDZhZi5KN4Nzxz1O1%2FiPlHfZMPkqfHG49Lffisv5tHfoGFh7RH%2BtSaOAFJNLWxG%2Fj2gEfGb7GroeNM1E6A0RL2xCmYjEn9hWQ%2FBf5VZUtzCOeQIozx3Zu8E5m%2FzZ4dXrpFXWdiQZEBf4z9MiUuNBmeETR9rFmOjesqnPOED4sxF8vbpOximVaeQBFH6zBJn2Cw2Nn9osSZjoSLaZY%2FZoH%2Belb0AUIqOsxGOLFh7R%2FzdZudAvKaDQJoTtTpdDdPdSVd9j1P8uy0iGiyyx8YV6QgC4m7YkvtLzp%2FWX7kSEEM%2BbWYTMInwV90gBSpCDUwy9Al17oCH9a0PrhaDAkmqhjUntL%2B3ZtVLxPSRP8myxtNeFMr4%2BMfR6SRb9l26Tpnp3ajAr3Wa3bFUMiF6g50EKm%2Bz3cr71pAXvLO4X8ssMgOeHmbpJgorGpj7Bq7h9PA5SrIXrcWPClBGWw%3D%3D&nvMid=82404172317&catId=50000304"));
                startActivity(intent);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.setData(Uri.parse("https://cr.shopping.naver.com/adcr.nhn?x=jWJordpW9OHzeuWmiq6XR%2F%2F%2F%2Fw%3D%3DsvushrINFfKkBLVO2z%2FGo3ngGoH%2BHZ4ulOZ9uFXD4qqi9Oz9tjt1cQF7eRLaKIZJCS3Z4Aa51M3v1S4PJuroCzNckXOT%2F3LAxl9LO8wQZPi254J8UO7LDGXdPU9Do8oyM%2BUMsZr7MfVU%2B4cFbJufs9ZbCVuSayNdKiSv8F%2FxmByQ1%2FKvuuGxS9TR3HG5z1aoLFGykWDD3vNyQlH%2Fh6xDVpbzg5LotibZWs96FaOW7%2BneOP0oYFbr1kQPfR4PYNcaQ0lAFPlrW8QPqZ8NshHPOHU0NP9HDDndRYZb81H2bHtKGZ5a0ma%2FDwz3QQr7PLlrXJV03cukp%2F9sq6JmLvPVclHzJFX0vrV3Abp5J8yruvp5Nz3Y3DvUXDyh6%2BB89EbOlx72P1MzfeDsyK%2BcBtz34gHsMbRkWyzPljF1XLNmH5pAImECEoN5tVJiii7WIZdK8TXUuZQLznUEM96FCNQuxjpkKu5Sy6sy6OjCZH%2FtgBmsBHytYVA2vC0ptB5fw42i0eiABWdZoLC0dny1ymsxsoHH2eYOcjpnmAUoAKg%2BznWSea%2BQUGnAnYtZqNGMGO%2FVE4jT%2FHhbTvQa5R%2BVEp8CW%2FEmhWqi2KUWeHP%2FeqLQC2DxBHrLPWgduJQ%2F%2B5ClaSkk7aRrsFSvqjPzgeMeN3IGqqSOEVDqAk%2BMT5F7JaG2WbArgqaB256y%2F2yYfzEuV3oiYV3OdHgSE8LoEjTx9zpNPbFaRsOtQUnaEEbxBoHxZXOc%3D&nvMid=82837016438&catId=50000304"));
                startActivity(intent);
            }
        });

        return view;

    }
}
